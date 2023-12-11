package com.service.consommationgrpcserver.services;

import com.service.consommationgrpcserver.mapper.BordereauMapper;
import com.service.consommationgrpcserver.models.Bordereau;
import com.service.consommationgrpcserver.models.Consommation;
import com.service.consommationgrpcserver.repositories.BordereauRepository;
import com.service.consommationgrpcserver.repositories.ConsommationRepository;
import com.service.consommationgrpcserver.stub.BordereauOuterClass;
import com.service.consommationgrpcserver.stub.BordereauServiceGrpc;
import com.service.consommationgrpcserver.stub.ConsommationOuterClass;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class BordereauService extends BordereauServiceGrpc.BordereauServiceImplBase {

    private BordereauMapper bordereauMapper;
    private BordereauRepository bordereauRepository;
    private ConsommationRepository consommationRepository;

    public BordereauService(BordereauMapper bordereauMapper, BordereauRepository bordereauRepository, ConsommationRepository consommationRepository) {
        this.bordereauMapper = bordereauMapper;
        this.bordereauRepository = bordereauRepository;
        this.consommationRepository = consommationRepository;
    }

    @Override
    public void getAllBordereaus(BordereauOuterClass.GetAllBordereauxRequest request, StreamObserver<BordereauOuterClass.GetAllBordereauxResponse> responseObserver) {
        List<Bordereau> bordereaux = bordereauRepository.findAll();
        List<BordereauOuterClass.Bordereau> grpcBordereeax = bordereaux.stream()
                .map(bordereauMapper::fromEntity).collect(Collectors.toList());
        BordereauOuterClass.GetAllBordereauxResponse response = BordereauOuterClass.GetAllBordereauxResponse
                .newBuilder().addAllBordereaux(grpcBordereeax)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getBordereauById(BordereauOuterClass.GetBordereauByIdRequest request, StreamObserver<BordereauOuterClass.GetBordereauByIdResponse> responseObserver) {
        Bordereau bordereau = bordereauRepository.findById(request.getId()).get();
        BordereauOuterClass.GetBordereauByIdResponse response =
                BordereauOuterClass.GetBordereauByIdResponse
                        .newBuilder().setBordereau(bordereauMapper.fromEntity(bordereau))
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveBordereau(BordereauOuterClass.SaveBordereauRequest request, StreamObserver<BordereauOuterClass.SaveBordereauResponse> responseObserver) {
        System.out.println("request server : "+request);
        Bordereau bordereau = bordereauMapper.fromGrpcRequest(request.getBordereauRequest());
        System.out.println("bordereau server : "+bordereau);
        Bordereau saveBordereau= bordereauRepository.save(bordereau);
        System.out.println("saveBordereau server : "+saveBordereau);
        BordereauOuterClass.SaveBordereauResponse response = BordereauOuterClass.SaveBordereauResponse.newBuilder()
                .setBordereau(bordereauMapper.fromEntity(saveBordereau))
                .build();
        System.out.println("response server : "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateBordereau(BordereauOuterClass.UpdateBordereauRequest request, StreamObserver<BordereauOuterClass.UpdateBordereauResponse> responseObserver) {
        System.out.println("request update  "+request);
        BordereauOuterClass.Bordereau bordereauRequest = request.getBordereau();
        System.out.println("Request update  "+bordereauRequest);
        Bordereau existingData = bordereauMapper.fromGrpcClass(bordereauRequest);
        System.out.println("existingData update local "+existingData);
        Bordereau updateData = bordereauRepository.save(existingData);
        System.out.println("updateData update local "+updateData);
        BordereauOuterClass.UpdateBordereauResponse response = BordereauOuterClass.UpdateBordereauResponse.newBuilder()
                .setBordereau(bordereauMapper.fromEntity(updateData))
                .build();
        System.out.println("response update data "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteBordereau(BordereauOuterClass.DeleteBordereauRequest request, StreamObserver<BordereauOuterClass.DeleteBordereauResponse> responseObserver) {
        try {
            Long id = request.getId();
            Optional<Bordereau> IdOptional = bordereauRepository.findById(id);

            if (IdOptional.isPresent()) {
                bordereauRepository.deleteById(id);

                BordereauOuterClass.DeleteBordereauResponse response = BordereauOuterClass.DeleteBordereauResponse.newBuilder()
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

  /*  @Override
    public void addFactureToBordereau(BordereauOuterClass.AddFactureRequest request, StreamObserver<BordereauOuterClass.AddFactureResponse> responseObserver) {
        Bordereau bordereau = bordereauRepository.findById(request.getId()).get();

        System.out.println("bordereau "+bordereau);
        Consommation consommation = consommationRepository.findById(request.getConsommation().getId()).get();
        System.out.println("consommation "+consommation);
        //ConsommationOuterClass.Consommation consommation1 = request.getConsommation();
        consommation.setBordereau(bordereau);
        consommationRepository.save(consommation);
        System.out.println("updateData consommation "+consommation);
       // bordereau.getConsommations().add(consommation);
        //Bordereau updateData = bordereauRepository.save(bordereau);
        //System.out.println("updateData "+updateData);
        BordereauOuterClass.AddFactureResponse response =
                BordereauOuterClass.AddFactureResponse
                        .newBuilder()
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }*/
}
