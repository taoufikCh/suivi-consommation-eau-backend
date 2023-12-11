package com.service.localgrpcclient.controllers;

import com.service.localgrpcclient.dto.RegionDto;
import com.service.localgrpcclient.entities.District;
import com.service.localgrpcclient.entities.Region;
import com.service.localgrpcclient.mapper.DistrictMapper;
import com.service.localgrpcclient.mapper.RegionMapper;
import com.service.localgrpcclient.stub.DistrictOuterClass;
import com.service.localgrpcclient.stub.DistrictServiceGrpc;
import com.service.localgrpcclient.stub.RegionOuterClass;
import com.service.localgrpcclient.stub.RegionServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/api/v1/region")
@CrossOrigin
@RequiredArgsConstructor
public class RegionController {

    @Autowired
    private RegionMapper regionMapper;
    @Autowired
    private DistrictMapper districtMapper;

    @GrpcClient(value = "localService")
    private DistrictServiceGrpc.DistrictServiceBlockingStub districtServiceBlockingStub;

    @GrpcClient(value = "localService")
    private RegionServiceGrpc.RegionServiceBlockingStub regionServiceBlockingStub;

    @GetMapping
    public List<Region> getAllRegions(){
        RegionOuterClass.GetAllRegionsRequest request =
                RegionOuterClass.GetAllRegionsRequest.newBuilder()
                        .build();
        System.out.println("request in controller :"+request);
        RegionOuterClass.GetAllRegionsResponse response =
                regionServiceBlockingStub.getAllRegions(request);
        System.out.println("response in controller :"+response);
        List<RegionOuterClass.Region> regionList = response.getRegionsList();
        System.out.println("regionList in controller :"+regionList);
        List<Region> regions = regionList.stream().map(regionMapper::fromGrpcClass).collect(Collectors.toList());
        System.out.println("regions in controller :"+regions);
        return regions;
    }

    @GetMapping("/{id}")
    public Region regionById(@PathVariable Long id){
        RegionOuterClass.GetRegionByIdRequest request =
                RegionOuterClass.GetRegionByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        RegionOuterClass.GetRegionByIdResponse response =
                regionServiceBlockingStub.getRegionById(request);
        return regionMapper.fromGrpcClass(response.getRegion());
    }

     @PostMapping
    public Region createRegion(@RequestBody Region region) {
       System.out.println("region : "+region);
        District district = region.getDistrict();
        System.out.println("district : "+district);
        DistrictOuterClass.District d = districtMapper.fromEntity(district);
        System.out.println("district grpc : "+d);
        //RegionOuterClass.RegionRequest regionRequest = regionMapper.toGrpcRegionRequest(region);
        //regionRequest.
        //System.out.println("regionRequest : "+regionRequest);

        RegionOuterClass.SaveRegionRequest request = RegionOuterClass.SaveRegionRequest.newBuilder()
                .setDistrict(d)
                .setCode(region.getCode())
                .setLibille(region.getLibille())
                .build();
        System.out.println("request : "+request);
        RegionOuterClass.SaveRegionResponse response = regionServiceBlockingStub.saveRegion(request);
        System.out.println("response : "+response);
        return regionMapper.fromGrpcClass(response.getRegion());
    }
    @GetMapping("/district/{id}")
    public List<RegionDto> regionByDistrict(@PathVariable Long id){
        //System.out.println("id "+id);
        DistrictOuterClass.GetDistrictByIdRequest request =
                DistrictOuterClass.GetDistrictByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        //System.out.println("request "+request);
        DistrictOuterClass.GetDistrictByIdResponse response =
                districtServiceBlockingStub.getDistrictById(request);
        //System.out.println("response "+response);
        DistrictOuterClass.District district = response.getDistrict();

        RegionOuterClass.GetRegionsByDistrictRequest regionsByDistrictRequest =
                RegionOuterClass.GetRegionsByDistrictRequest.newBuilder()
                        .setDistrict(district)
                        .build();
        RegionOuterClass.GetRegionsByDistrictResponse regionsByDistrictResponse =
                regionServiceBlockingStub.getRegionsByDistrict(regionsByDistrictRequest);
        List<RegionOuterClass.Region> regionList = regionsByDistrictResponse.getRegionsList();
        List<RegionDto> regions = regionList.stream().map(regionMapper::fromGrpcWithoutDistrict).collect(Collectors.toList());
        System.out.println("regions in controller :"+regions);
        return regions;
    }

}
