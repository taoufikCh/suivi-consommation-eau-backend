package com.service.localgrpcserver.service;

import com.service.localgrpcserver.entities.NatureExercise;
import com.service.localgrpcserver.entities.TypeLocal;
import com.service.localgrpcserver.mapper.NatureExerciseMapper;
import com.service.localgrpcserver.mapper.TypeLocalMapper;
import com.service.localgrpcserver.repositories.NatureExerciseRepository;
import com.service.localgrpcserver.repositories.TypeLocalRepository;
import com.service.localgrpcserver.stub.NatureExerciseOuterClass;
import com.service.localgrpcserver.stub.NatureExerciseServiceGrpc;
import com.service.localgrpcserver.stub.TypeLocalOuterClass;
import com.service.localgrpcserver.stub.TypeLocalServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class TypeLocalService extends TypeLocalServiceGrpc.TypeLocalServiceImplBase {

    private TypeLocalRepository typeLocalRepository;
    private TypeLocalMapper typeLocalMapper;

    public TypeLocalService(TypeLocalRepository typeLocalRepository, TypeLocalMapper typeLocalMapper){
        this.typeLocalRepository = typeLocalRepository;
        this.typeLocalMapper = typeLocalMapper;
    }

    @Override
    public void getAllTypeLocals(TypeLocalOuterClass.GetAllTypeLocalsRequest request, StreamObserver<TypeLocalOuterClass.GetAllTypeLocalsResponse> responseObserver) {
        List<TypeLocal> typeLocals = typeLocalRepository.findAll();
        List<TypeLocalOuterClass.TypeLocal> grpcTypeLocal = typeLocals.stream()
                .map(typeLocalMapper::fromEntity).collect(Collectors.toList());
        TypeLocalOuterClass.GetAllTypeLocalsResponse typeLocalsResponse = TypeLocalOuterClass.GetAllTypeLocalsResponse.newBuilder()
                .addAllTypeLocal(grpcTypeLocal)
                .build();
        responseObserver.onNext(typeLocalsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getTypeLocalById(TypeLocalOuterClass.GetTypeLocalByIdRequest request, StreamObserver<TypeLocalOuterClass.GetTypeLocalByIdResponse> responseObserver) {
        TypeLocal typeLocal = typeLocalRepository.findById(request.getId()).get();
        TypeLocalOuterClass.GetTypeLocalByIdResponse response =
                TypeLocalOuterClass.GetTypeLocalByIdResponse.newBuilder()
                        .setTypeLocal(typeLocalMapper.fromEntity(typeLocal))
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveTypeLocal(TypeLocalOuterClass.SaveTypeLocalRequest request, StreamObserver<TypeLocalOuterClass.SaveTypeLocalResponse> responseObserver) {
        String designation = request.getDesignation();
        TypeLocal typeLocal = TypeLocal.builder()
                .designation(designation)
                .build();
        TypeLocal saveTypeLocal = typeLocalRepository.save(typeLocal);
        TypeLocalOuterClass.SaveTypeLocalResponse response =TypeLocalOuterClass.SaveTypeLocalResponse.newBuilder()
                .setTypeLocal(typeLocalMapper.fromEntity(saveTypeLocal))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateTypeLocal(TypeLocalOuterClass.UpdateTypeLocalRequest request, StreamObserver<TypeLocalOuterClass.UpdateTypeLocalResponse> responseObserver) {
        TypeLocalOuterClass.TypeLocal typeLocal = request.getTypeLocal();
        TypeLocal existingData = typeLocalMapper.fromGrpcClass(typeLocal);
        TypeLocal updateData = typeLocalRepository.save(existingData);
        TypeLocalOuterClass.UpdateTypeLocalResponse response = TypeLocalOuterClass.UpdateTypeLocalResponse.newBuilder()
                .setTypeLocal(typeLocalMapper.fromEntity(updateData))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteTypeLocal(TypeLocalOuterClass.DeleteTypeLocalRequest request, StreamObserver<TypeLocalOuterClass.DeleteTypeLocalResponse> responseObserver) {
        try {
            Long id = request.getId();
            Optional<TypeLocal> typeLocal = typeLocalRepository.findById(id);

            if (typeLocal.isPresent()) {
                typeLocalRepository.deleteById(id);

                TypeLocalOuterClass.DeleteTypeLocalResponse response = TypeLocalOuterClass.DeleteTypeLocalResponse.newBuilder()
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                responseObserver.onError(Status.NOT_FOUND.withDescription("not found").asException());
            }
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to delete ").asException());
        }
    }



}
