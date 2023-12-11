package com.service.compteurgrpcserver.services;

import com.service.compteurgrpcserver.mapper.CompteurMapper;
import com.service.compteurgrpcserver.mapper.LocalMapper;
import com.service.compteurgrpcserver.models.Compteur;
import com.service.compteurgrpcserver.models.Local;
import com.service.compteurgrpcserver.repositories.CompteurRepository;
import com.service.compteurgrpcserver.stub.CompteurOuterClass;
import com.service.compteurgrpcserver.stub.CompteurServiceGrpc;
import com.service.compteurgrpcserver.stub.LocalOuterClass;
import com.service.compteurgrpcserver.stub.LocalServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class CompteurService extends CompteurServiceGrpc.CompteurServiceImplBase {

    private CompteurRepository compteurRepository;
    private CompteurMapper compteurMapper;
    private LocalMapper localMapper;
    @GrpcClient("localService")
    private LocalServiceGrpc.LocalServiceBlockingStub localServiceStub;

    public CompteurService(CompteurRepository compteurRepository, CompteurMapper compteurMapper, LocalMapper localMapper) {
        this.compteurRepository = compteurRepository;
        this.compteurMapper = compteurMapper;
        this.localMapper = localMapper;
    }

    @Override
    public void getAllCompteurs(CompteurOuterClass.GetAllCompteursRequest request, StreamObserver<CompteurOuterClass.GetAllCompteursResponse> responseObserver) {
        List<Compteur> compteurs = compteurRepository.findAll();
        List<CompteurOuterClass.Compteur> grpcCompteurs = compteurs.stream()
                .map(compteurMapper::fromEntity).collect(Collectors.toList());
        CompteurOuterClass.GetAllCompteursResponse compteursResponse = CompteurOuterClass.GetAllCompteursResponse
                .newBuilder().addAllCompteurs(grpcCompteurs)
                .build();
        responseObserver.onNext(compteursResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getCompteurById(CompteurOuterClass.GetCompteurByIdRequest request, StreamObserver<CompteurOuterClass.GetCompteurByIdResponse> responseObserver) {
        Compteur compteur = compteurRepository.findById(request.getId()).get();
        CompteurOuterClass.GetCompteurByIdResponse compteursResponse =
                CompteurOuterClass.GetCompteurByIdResponse
                .newBuilder().setCompteur(compteurMapper.fromEntity(compteur))
                .build();
        responseObserver.onNext(compteursResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void saveCompteur(CompteurOuterClass.SaveCompteurRequest request, StreamObserver<CompteurOuterClass.SaveCompteurResponse> responseObserver) {
        System.out.println("request server : "+request);
        Compteur compteur = compteurMapper.fromGrpcCompteurRequest(request);
        System.out.println("compt server : "+compteur);
        Compteur saveCompteur = compteurRepository.save(compteur);
        System.out.println("saveLocal server : "+saveCompteur);
        CompteurOuterClass.SaveCompteurResponse response = CompteurOuterClass.SaveCompteurResponse.newBuilder()
                .setCompteur(compteurMapper.fromEntity(saveCompteur))
                .build();
        System.out.println("response server : "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateCompteur(CompteurOuterClass.UpdateCompteurRequest request, StreamObserver<CompteurOuterClass.UpdateCompteurResponse> responseObserver) {
        System.out.println("request update compteur "+request);
        CompteurOuterClass.Compteur compteurRequest = request.getCompteur();
        System.out.println("Request update  "+compteurRequest);
        Compteur existingData = compteurMapper.fromGrpcClass(compteurRequest);
        System.out.println("existingData update local "+existingData);
        Compteur updateData = compteurRepository.save(existingData);
        System.out.println("updateData update local "+updateData);
        CompteurOuterClass.UpdateCompteurResponse response = CompteurOuterClass.UpdateCompteurResponse.newBuilder()
                .setCompteur(compteurMapper.fromEntity(updateData))
                .build();
        System.out.println("response update data "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCompteursByLocal(CompteurOuterClass.GetCompteursByLocalRequest request, StreamObserver<CompteurOuterClass.GetCompteursByLocalResponse> responseObserver) {

        LocalOuterClass.GetLocalByIdRequest localRequest =
                LocalOuterClass.GetLocalByIdRequest.newBuilder()
                        .setId(request.getLocalID())
                        .build();

            LocalOuterClass.GetLocalByIdResponse LocalResponse =
                    localServiceStub.getLocalById(localRequest);
            Local local = localMapper.fromGrpcLocal(LocalResponse.getLocal());

        System.out.println("local  : "+local);
        List<Compteur> locals = compteurRepository.getCompteurByLocalID(local.getId());
        System.out.println("locals  : "+locals);
        // Create a response message
        List<CompteurOuterClass.Compteur> grpcLocals = locals.stream()
                .map(compteurMapper::fromEntity).collect(Collectors.toList());
        System.out.println("grpcLocals  : "+grpcLocals);
        CompteurOuterClass.GetCompteursByLocalResponse response =
                CompteurOuterClass.GetCompteursByLocalResponse.newBuilder()
                .addAllCompteurs(grpcLocals)
                .build();
        System.out.println("response  : "+response);
        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteCompteur(CompteurOuterClass.DeleteCompteurRequest request, StreamObserver<CompteurOuterClass.DeleteCompteurResponse> responseObserver) {
        try {
            Long id = request.getId();
            Optional<Compteur> IdOptional = compteurRepository.findById(id);

            if (IdOptional.isPresent()) {
                compteurRepository.deleteById(id);

                CompteurOuterClass.DeleteCompteurResponse response = CompteurOuterClass.DeleteCompteurResponse.newBuilder()
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


}
