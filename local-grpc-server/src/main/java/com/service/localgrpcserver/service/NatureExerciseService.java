package com.service.localgrpcserver.service;

import com.service.localgrpcserver.entities.NatureExercise;
import com.service.localgrpcserver.mapper.NatureExerciseMapper;
import com.service.localgrpcserver.repositories.NatureExerciseRepository;
import com.service.localgrpcserver.stub.NatureExerciseOuterClass;
import com.service.localgrpcserver.stub.NatureExerciseServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class NatureExerciseService extends NatureExerciseServiceGrpc.NatureExerciseServiceImplBase {

    private NatureExerciseRepository natureExerciseRepository;
    private NatureExerciseMapper natureExerciseMapper;

    public NatureExerciseService(NatureExerciseRepository natureExerciseRepository, NatureExerciseMapper natureExerciseMapper){
        this.natureExerciseRepository = natureExerciseRepository;
        this.natureExerciseMapper = natureExerciseMapper;
    }

    @Override
    public void getAllNatureExercises(NatureExerciseOuterClass.GetAllNatureExercisesRequest request, StreamObserver<NatureExerciseOuterClass.GetAllNatureExercisesResponse> responseObserver) {
        List<NatureExercise> natureExerciseList = natureExerciseRepository.findAll();
        List<NatureExerciseOuterClass.NatureExercise> grpcNatureExercices = natureExerciseList.stream()
                .map(natureExerciseMapper::fromEntity).collect(Collectors.toList());
        NatureExerciseOuterClass.GetAllNatureExercisesResponse localsResponse = NatureExerciseOuterClass.GetAllNatureExercisesResponse.newBuilder()
                .addAllNatureExercises(grpcNatureExercices)
                .build();
        responseObserver.onNext(localsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getNatureExerciseById(NatureExerciseOuterClass.GetNatureExerciseByIdRequest request, StreamObserver<NatureExerciseOuterClass.GetNatureExerciseByIdResponse> responseObserver) {
        NatureExercise natureEntity = natureExerciseRepository.findById(request.getId()).get();
        NatureExerciseOuterClass.GetNatureExerciseByIdResponse response =
                NatureExerciseOuterClass.GetNatureExerciseByIdResponse.newBuilder()
                        .setNatureExercise(natureExerciseMapper.fromEntity(natureEntity))
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveNatureExercise(NatureExerciseOuterClass.SaveNatureExerciseRequest request, StreamObserver<NatureExerciseOuterClass.SaveNatureExerciseResponse> responseObserver) {
       String designation = request.getDesignation();
        NatureExercise natureExercise = NatureExercise.builder()
                .designation(designation)
                .build();
        NatureExercise saveNatureExercise = natureExerciseRepository.save(natureExercise);
        NatureExerciseOuterClass.SaveNatureExerciseResponse response = NatureExerciseOuterClass.SaveNatureExerciseResponse.newBuilder()
                .setNatureExercise(natureExerciseMapper.fromEntity(saveNatureExercise))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateNatureExercise(NatureExerciseOuterClass.UpdateNatureExerciseRequest request, StreamObserver<NatureExerciseOuterClass.UpdateNatureExerciseResponse> responseObserver) {
        NatureExerciseOuterClass.NatureExercise natureRequest = request.getNatureExercise();
        NatureExercise existingNature = natureExerciseMapper.fromGrpcClass(natureRequest);
        NatureExercise updateNature = natureExerciseRepository.save(existingNature);
        NatureExerciseOuterClass.UpdateNatureExerciseResponse response = NatureExerciseOuterClass.UpdateNatureExerciseResponse.newBuilder()
                .setNatureExercise(natureExerciseMapper.fromEntity(updateNature))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteNatureExercise(NatureExerciseOuterClass.DeleteNatureExerciseRequest request, StreamObserver<NatureExerciseOuterClass.DeleteNatureExerciseResponse> responseObserver) {
        try {
            Long id = request.getId();
            Optional<NatureExercise> natureExercise = natureExerciseRepository.findById(id);

            if (natureExercise.isPresent()) {
                natureExerciseRepository.deleteById(id);

                NatureExerciseOuterClass.DeleteNatureExerciseResponse response = NatureExerciseOuterClass.DeleteNatureExerciseResponse.newBuilder()
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
