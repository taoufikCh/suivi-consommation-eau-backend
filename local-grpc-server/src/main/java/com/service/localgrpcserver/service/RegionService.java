package com.service.localgrpcserver.service;

import com.service.localgrpcserver.entities.District;
import com.service.localgrpcserver.entities.Region;
import com.service.localgrpcserver.mapper.DistrictMapper;
import com.service.localgrpcserver.mapper.RegionMapper;
import com.service.localgrpcserver.repositories.RegionRepository;
import com.service.localgrpcserver.stub.DistrictOuterClass;
import com.service.localgrpcserver.stub.RegionOuterClass;
import com.service.localgrpcserver.stub.RegionServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class RegionService extends RegionServiceGrpc.RegionServiceImplBase {

    private RegionRepository regionRepository;
    private RegionMapper regionMapper;
    private DistrictMapper districtMapper;


    public RegionService(RegionRepository regionRepository, RegionMapper regionMapper,DistrictMapper districtMapper) {
        this.regionRepository = regionRepository;
        this.regionMapper = regionMapper;
        this.districtMapper = districtMapper;
    }

    @Override
    public void getAllRegions(RegionOuterClass.GetAllRegionsRequest request, StreamObserver<RegionOuterClass.GetAllRegionsResponse> responseObserver) {
        List<Region> regions =  regionRepository.findAll();
        System.out.println("regions : "+regions);
        List<RegionOuterClass.Region> grpcRegions = regions.stream()
                .map(regionMapper::fromEntity).collect(Collectors.toList());
        System.out.println("grpcRegions : "+grpcRegions);
        RegionOuterClass.GetAllRegionsResponse response = RegionOuterClass.GetAllRegionsResponse.newBuilder()
                .addAllRegions(grpcRegions)
                .build();
        System.out.println("response : "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRegionById(RegionOuterClass.GetRegionByIdRequest request, StreamObserver<RegionOuterClass.GetRegionByIdResponse> responseObserver) {
        Region region = regionRepository.findById(request.getId()).get();
        RegionOuterClass.GetRegionByIdResponse response =
                RegionOuterClass.GetRegionByIdResponse.newBuilder()
                        .setRegion(regionMapper.fromEntity(region))
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveRegion(RegionOuterClass.SaveRegionRequest request, StreamObserver<RegionOuterClass.SaveRegionResponse> responseObserver) {
        System.out.println("request server : "+request);
        //RegionOuterClass.S region = request.get;
        //System.out.println("region requeest : "+regionRequest);
        Region region = regionMapper.fromGrpcRegionRequest(request);
        System.out.println("region  : "+region);
        Region saveData = regionRepository.save(region);
        System.out.println("saveData : "+saveData);
        RegionOuterClass.SaveRegionResponse response = RegionOuterClass.SaveRegionResponse.newBuilder()
                .setRegion(regionMapper.fromEntity(saveData))
                .build();
        System.out.println("region response : "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRegionsByDistrict(RegionOuterClass.GetRegionsByDistrictRequest request, StreamObserver<RegionOuterClass.GetRegionsByDistrictResponse> responseObserver) {
        // Assuming you have some service or logic to retrieve regions based on the request
        District district= districtMapper.fromGrpcClass(request.getDistrict());
        System.out.println("district "+district);
        List<Region> regions = regionRepository.getRegionsByDistrict(district);
        System.out.println("regions "+regions);
        // Create a response message
        List<RegionOuterClass.Region> grpcRegions = regions.stream()
                .map(regionMapper::fromEntity).collect(Collectors.toList());
        System.out.println("grpcRegions "+grpcRegions);
        RegionOuterClass.GetRegionsByDistrictResponse response = RegionOuterClass.GetRegionsByDistrictResponse.newBuilder()
                .addAllRegions(grpcRegions)
                .build();
        System.out.println("response "+response);
        // Send the response back to the client
        responseObserver.onNext(response);

        // Complete the RPC call
        responseObserver.onCompleted();
    }
}
