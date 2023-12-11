package com.service.localgrpcserver.service;

import com.service.localgrpcserver.entities.District;
import com.service.localgrpcserver.mapper.DistrictMapper;
import com.service.localgrpcserver.repositories.DistrictRepository;
import com.service.localgrpcserver.stub.DistrictOuterClass;
import com.service.localgrpcserver.stub.DistrictServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class DistrictService extends DistrictServiceGrpc.DistrictServiceImplBase {

    private DistrictRepository districtRepository;
    private DistrictMapper districtMapper;

    public DistrictService(DistrictRepository districtRepository, DistrictMapper districtMapper) {
        this.districtRepository = districtRepository;
        this.districtMapper = districtMapper;
    }

    @Override
    public void getAllDistricts(DistrictOuterClass.GetAllDistrictsRequest request, StreamObserver<DistrictOuterClass.GetAllDistrictsResponse> responseObserver) {
        List<District> districts =  districtRepository.findAll();
        System.out.println("districts : "+districts);
        List<DistrictOuterClass.District> grpcDistricts = districts.stream()
                .map(districtMapper::fromEntity).collect(Collectors.toList());
        DistrictOuterClass.GetAllDistrictsResponse districtsResponse = DistrictOuterClass.GetAllDistrictsResponse.newBuilder()
                .addAllDistricts(grpcDistricts)
                .build();
        responseObserver.onNext(districtsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getDistrictById(DistrictOuterClass.GetDistrictByIdRequest request, StreamObserver<DistrictOuterClass.GetDistrictByIdResponse> responseObserver) {
        System.out.println("request = "+request);
        District district = districtRepository.findById(request.getId()).get();
        System.out.println("district = "+district);
        DistrictOuterClass.GetDistrictByIdResponse response =
                DistrictOuterClass.GetDistrictByIdResponse.newBuilder()
                        .setDistrict(districtMapper.fromEntity(district))
                        .build();
        System.out.println("response = "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveDistrict(DistrictOuterClass.SaveDistrictRequest request, StreamObserver<DistrictOuterClass.SaveDistrictResponse> responseObserver) {
        DistrictOuterClass.DistrictRequest districtRequest = request.getDistrict();
        District district = districtMapper.fromGrpcDistrictRequest(districtRequest);
        District saveData = districtRepository.save(district);
        DistrictOuterClass.SaveDistrictResponse response = DistrictOuterClass.SaveDistrictResponse.newBuilder()
                .setDistrict(districtMapper.fromEntity(saveData))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}
