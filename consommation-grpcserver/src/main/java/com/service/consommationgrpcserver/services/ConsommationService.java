package com.service.consommationgrpcserver.services;

import com.service.consommationgrpcserver.mapper.ConsommationMapper;
import com.service.consommationgrpcserver.models.Consommation;
import com.service.consommationgrpcserver.repositories.ConsommationRepository;
import com.service.consommationgrpcserver.stub.ConsommationOuterClass;
import com.service.consommationgrpcserver.stub.ConsommationServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class ConsommationService  extends ConsommationServiceGrpc.ConsommationServiceImplBase {
    private ConsommationRepository consommationRepository;
    private ConsommationMapper consommationMapper;

    public ConsommationService(ConsommationRepository consommationRepository, ConsommationMapper consommationMapper) {
        this.consommationRepository = consommationRepository;
        this.consommationMapper = consommationMapper;
    }

    @Override
    public void getAllConsommations(ConsommationOuterClass.GetAllConsommationsRequest request, StreamObserver<ConsommationOuterClass.GetAllConsommationsResponse> responseObserver) {
        List<Consommation> consommations = consommationRepository.findAll();
        List<ConsommationOuterClass.Consommation> grpcConsommations = consommations.stream()
                .map(consommationMapper::fromEntity).collect(Collectors.toList());
        ConsommationOuterClass.GetAllConsommationsResponse consommationsResponse = ConsommationOuterClass.GetAllConsommationsResponse
                .newBuilder().addAllConsommations(grpcConsommations)
                .build();
        responseObserver.onNext(consommationsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getConsommationById(ConsommationOuterClass.GetConsommationByIdRequest request, StreamObserver<ConsommationOuterClass.GetConsommationByIdResponse> responseObserver) {
        Consommation consommation = consommationRepository.findById(request.getId()).get();
        ConsommationOuterClass.GetConsommationByIdResponse consommationsResponse =
                ConsommationOuterClass.GetConsommationByIdResponse
                        .newBuilder().setConsommation(consommationMapper.fromEntity(consommation))
                        .build();
        responseObserver.onNext(consommationsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void saveConsommation(ConsommationOuterClass.SaveConsommationRequest request, StreamObserver<ConsommationOuterClass.SaveConsommationResponse> responseObserver) {
        System.out.println("request server : "+request);
        Consommation consommation = consommationMapper.fromGrpcConsommationRequest(request.getConsommationRequest());
        System.out.println("consommation server : "+consommation);
        Consommation saveConsommation= consommationRepository.save(consommation);
        System.out.println("saveConsommation server : "+saveConsommation);
        ConsommationOuterClass.SaveConsommationResponse response = ConsommationOuterClass.SaveConsommationResponse.newBuilder()
                .setConsommation(consommationMapper.fromEntity(saveConsommation))
                .build();
        System.out.println("response server : "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateConsommation(ConsommationOuterClass.UpdateConsommationRequest request, StreamObserver<ConsommationOuterClass.UpdateConsommationResponse> responseObserver) {
        System.out.println("request update  "+request);
        ConsommationOuterClass.Consommation consommationRequest = request.getConsommation();
        System.out.println("Request update  "+consommationRequest);
        Consommation existingData = consommationMapper.fromGrpcClass(consommationRequest);
        System.out.println("existingData update local "+existingData);
        Consommation updateData = consommationRepository.save(existingData);
        System.out.println("updateData update local "+updateData);
        ConsommationOuterClass.UpdateConsommationResponse response = ConsommationOuterClass.UpdateConsommationResponse.newBuilder()
                .setConsommation(consommationMapper.fromEntity(updateData))
                .build();
        System.out.println("response update data "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteConsommation(ConsommationOuterClass.DeleteConsommationRequest request, StreamObserver<ConsommationOuterClass.DeleteConsommationResponse> responseObserver) {
        try {
            Long id = request.getId();
            Optional<Consommation> IdOptional = consommationRepository.findById(id);

            if (IdOptional.isPresent()) {
                consommationRepository.deleteById(id);

                ConsommationOuterClass.DeleteConsommationResponse response = ConsommationOuterClass.DeleteConsommationResponse.newBuilder()
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                responseObserver.onError(Status.NOT_FOUND.withDescription("Data not found").asException());
            }
        } catch (Exception e) {
            // Handle exceptions and send an error response
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to delete data").asException());
        }
    }

    @Override
    public void getConsommationsByCompteur(ConsommationOuterClass.GetConsommationsByCompteurRequest request, StreamObserver<ConsommationOuterClass.GetConsommationsByCompteurResponse> responseObserver) {
        List<Consommation> consommations = consommationRepository.getConsommationByCompteurId(request.getCompteurID());
        System.out.println("consommations  : "+consommations);
        // Create a response message
        List<ConsommationOuterClass.Consommation> grpcConsommations = consommations.stream()
                .map(consommationMapper::fromEntity).collect(Collectors.toList());
        System.out.println("grpcConsommations  : "+grpcConsommations);
        ConsommationOuterClass.GetConsommationsByCompteurResponse response =
                ConsommationOuterClass.GetConsommationsByCompteurResponse.newBuilder()
                        .addAllConsommations(grpcConsommations)
                        .build();
        System.out.println("response  : "+response);
        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getConsommationByCompteursAndPeriod(ConsommationOuterClass.ConsommationFilterRequest request, StreamObserver<ConsommationOuterClass.ConsommationResponse> responseObserver) {
        // Retrieve filter parameters from gRPC request
        System.out.println("request  : "+request);
        List<Long> compteursID= request.getCompteurIdList();
        System.out.println("compteursID  : "+compteursID);
        LocalDate dateDebut = null;
        LocalDate dateFin = null;
        if(request.getDateDebut()!="") {
            dateDebut= LocalDate.parse(request.getDateDebut());
        }
        if(request.getDateFin()!="") {
            dateFin= LocalDate.parse(request.getDateFin());
        }

        System.out.println("dateDebut  : "+dateDebut);
        System.out.println("dateFin  : "+dateFin);
        List<Consommation> filteredConsommations =  new ArrayList<>();;
        if(compteursID.isEmpty()&dateDebut!=null&dateFin!=null){
            System.out.println("findByDateDebutBetween  ");
            filteredConsommations = consommationRepository.findByDateDebutBetween(dateDebut, dateFin);
        } else if (!compteursID.isEmpty()&dateDebut!=null&dateFin!=null) {
            System.out.println("findByCompteurIdInAndDateDebutBetween   ");
            filteredConsommations = consommationRepository.findByCompteurIdInAndDateDebutBetween(compteursID, dateDebut, dateFin);
        } else if (!compteursID.isEmpty()&dateDebut==null&dateFin==null) {
            System.out.println("findByCompteurIdIn   ");
            filteredConsommations = consommationRepository.findByCompteurIdIn(compteursID);
        }
        else if (compteursID.isEmpty()&dateDebut==null&dateFin!=null) {
            System.out.println("findByDateDebutBefore  ");
            filteredConsommations = consommationRepository.findByDateDebutBefore(dateFin);
        }
        else if (compteursID.isEmpty()&dateDebut!=null&dateFin==null) {
            System.out.println("findByDateDebutAfter  ");
            filteredConsommations = consommationRepository.findByDateDebutAfter(dateDebut);
        }
        else if (!compteursID.isEmpty()&dateDebut==null&dateFin!=null) {
            System.out.println("findByCompteurIdInAndDateDebutBefore  ");
            filteredConsommations = consommationRepository.findByCompteurIdInAndDateDebutBefore(compteursID,dateFin);
        }
        else if (!compteursID.isEmpty()&dateDebut!=null&dateFin==null) {
            System.out.println("findByCompteurIdInAndDateDebutAfter   ");
            filteredConsommations = consommationRepository.findByCompteurIdInAndDateDebutAfter(compteursID,dateDebut);
        }

        //List<Consommation> filteredConsommations = consommationRepository.findByCompteursAndPeriod(compteursID, dateDebut, dateFin);

        List<ConsommationOuterClass.Consommation> grpcConsommations = filteredConsommations.stream()
                .map(consommationMapper::fromEntity).collect(Collectors.toList());

        System.out.println("grpcConsommations  : "+grpcConsommations);
        ConsommationOuterClass.ConsommationResponse response = ConsommationOuterClass.ConsommationResponse.newBuilder()
                .addAllConsommations(grpcConsommations)
                .build();
        System.out.println("response  : "+response);

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
