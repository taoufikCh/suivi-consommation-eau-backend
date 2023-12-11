package com.service.localgrpcserver.service;

import com.service.localgrpcserver.entities.*;
import com.service.localgrpcserver.mapper.LocalMapper;
import com.service.localgrpcserver.mapper.NatureExerciseMapper;
import com.service.localgrpcserver.mapper.RegionMapper;
import com.service.localgrpcserver.mapper.TypeLocalMapper;
import com.service.localgrpcserver.repositories.LocalRepository;
import com.service.localgrpcserver.stub.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class LocalService extends LocalServiceGrpc.LocalServiceImplBase {

    private LocalRepository localRepository;
    private LocalMapper localMapper;
    private RegionMapper regionMapper;
    private NatureExerciseMapper natureExerciseMapper;
    private TypeLocalMapper typeLocalMapper;

    public LocalService(LocalRepository localRepository, LocalMapper localMapper, RegionMapper regionMapper, NatureExerciseMapper natureExerciseMapper, TypeLocalMapper typeLocalMapper){
        this.localRepository = localRepository;
        this.localMapper = localMapper;
        this.regionMapper = regionMapper;
        this.natureExerciseMapper = natureExerciseMapper;
        this.typeLocalMapper = typeLocalMapper;
    }

    @Override
    public void getAllLocals(LocalOuterClass.GetAllLocalsRequest request, StreamObserver<LocalOuterClass.GetAllLocalsResponse> responseObserver) {
        List<Local> locals = localRepository.findAll();
        List<LocalOuterClass.Local> grpcLocals = locals.stream()
                .map(localMapper::fromLocal).collect(Collectors.toList());
        LocalOuterClass.GetAllLocalsResponse localsResponse = LocalOuterClass.GetAllLocalsResponse.newBuilder()
                .addAllLocals(grpcLocals)
                .build();
        responseObserver.onNext(localsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getLocalById(LocalOuterClass.GetLocalByIdRequest request, StreamObserver<LocalOuterClass.GetLocalByIdResponse> responseObserver) {

        Local localEntity = localRepository.findById(request.getId()).get();
        LocalOuterClass.GetLocalByIdResponse response =
                LocalOuterClass.GetLocalByIdResponse.newBuilder()
                        .setLocal(localMapper.fromLocal(localEntity))
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveLocal(LocalOuterClass.SaveLocalRequest request, StreamObserver<LocalOuterClass.SaveLocalResponse> responseObserver) {
        System.out.println("request server : "+request);
        Local local = localMapper.fromGrpcLocalRequest(request);
        System.out.println("local server : "+local);
        Local saveLocal = localRepository.save(local);
        System.out.println("saveLocal server : "+saveLocal);
        LocalOuterClass.SaveLocalResponse response = LocalOuterClass.SaveLocalResponse.newBuilder()
                .setLocal(localMapper.fromLocal(saveLocal))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateLocal(LocalOuterClass.UpdateLocalRequest request, StreamObserver<LocalOuterClass.UpdateLocalResponse> responseObserver) {
        System.out.println("request update local "+request);
        LocalOuterClass.Local localRequest = request.getLocal();
        System.out.println("localRequest update local "+localRequest);
        Local existingLocal = localMapper.fromGrpcLocal(localRequest);
        System.out.println("existingLocal update local "+existingLocal);
        Local updateLocal = localRepository.save(existingLocal);
        System.out.println("updateLocal update local "+updateLocal);
        LocalOuterClass.UpdateLocalResponse response = LocalOuterClass.UpdateLocalResponse.newBuilder()
                .setLocal(localMapper.fromLocal(updateLocal))
                .build();
        System.out.println("response update local "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteLocal(LocalOuterClass.DeleteLocalRequest request, StreamObserver<LocalOuterClass.DeleteLocalResponse> responseObserver) {
        try {
            Long localId = request.getId();
            Optional<Local> localOptional = localRepository.findById(localId);

            if (localOptional.isPresent()) {
                // School found, delete it from the database
                localRepository.deleteById(localId);

                // Create a response indicating successful deletion (if needed)
                LocalOuterClass.DeleteLocalResponse response = LocalOuterClass.DeleteLocalResponse.newBuilder()
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                // School not found, send an error response
                responseObserver.onError(Status.NOT_FOUND.withDescription("Local not found").asException());
            }
        } catch (Exception e) {
            // Handle exceptions and send an error response
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to delete Local").asException());
        }
    }

    @Override
    public void getLocalsByRegion(LocalOuterClass.GetLocalsByRegionRequest request, StreamObserver<LocalOuterClass.GetLocalsByRegionResponse> responseObserver) {
        System.out.println("region request : "+request);
        Region region= regionMapper.fromGrpcClass(request.getRegion());
        System.out.println("region  : "+region);
        List<Local> locals = localRepository.getLocalByRegion(region);
        System.out.println("locals  : "+locals);
        // Create a response message
        List<LocalOuterClass.Local> grpcLocals = locals.stream()
                .map(localMapper::fromLocal).collect(Collectors.toList());
        System.out.println("grpcLocals  : "+grpcLocals);
        LocalOuterClass.GetLocalsByRegionResponse response = LocalOuterClass.GetLocalsByRegionResponse.newBuilder()
                .addAllLocals(grpcLocals)
                .build();
        System.out.println("response  : "+response);
        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getLocalsByFilters(LocalOuterClass.FilterRequest request, StreamObserver<LocalOuterClass.LocalsResponse> responseObserver) {
        // Retrieve filter parameters from gRPC request
        System.out.println("request  : "+request);
        Region region= regionMapper.fromGrpcClass(request.getRegion());
        System.out.println("region  : "+region);
        //NatureExercise n = request.getNatureExercise();
        NatureExercise natureExercise= natureExerciseMapper.fromGrpcClass(request.getNatureExercise());
        System.out.println("natureExercise  : "+natureExercise);
        TypeLocal typeLocal= typeLocalMapper.fromGrpcClass(request.getTypeLocal());
        System.out.println("typeLocal  : "+typeLocal);

        // Perform filtering logic as per your previous implementation using these parameters
        List<Local> filteredLocals = filterLocalsByParams(region, natureExercise, typeLocal);
        List<LocalOuterClass.Local> grpcLocals = filteredLocals.stream()
                .map(localMapper::fromLocal).collect(Collectors.toList());

        System.out.println("grpcLocals  : "+grpcLocals);
        LocalOuterClass.LocalsResponse response = LocalOuterClass.LocalsResponse.newBuilder()
                .addAllLocals(grpcLocals)
                .build();
        System.out.println("response  : "+response);

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    private List<Local> filterLocalsByParams(Region region, NatureExercise natureExercise, TypeLocal typeLocal) {
        if(region.getId()==0) {
            region = null;
        }
        if(natureExercise.getId()==0) {
            natureExercise = null;
        }
        if(typeLocal.getId()==0) {
            typeLocal = null;
        }
        List<Local> filteredLocals = localRepository.findLocalsByFilters(region, natureExercise, typeLocal);

        return filteredLocals;
    }
}
