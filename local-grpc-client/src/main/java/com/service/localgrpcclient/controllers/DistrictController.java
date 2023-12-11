package com.service.localgrpcclient.controllers;

import com.service.localgrpcclient.entities.District;
import com.service.localgrpcclient.mapper.DistrictMapper;
import com.service.localgrpcclient.stub.DistrictOuterClass;
import com.service.localgrpcclient.stub.DistrictServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/district")
@CrossOrigin
@RequiredArgsConstructor
public class DistrictController {

    @Autowired
    private DistrictMapper districtMapper;
    @GrpcClient(value = "localService")
    private DistrictServiceGrpc.DistrictServiceBlockingStub districtServiceBlockingStub;


    @GetMapping
    public List<District> getAllDistricts(){
        DistrictOuterClass.GetAllDistrictsRequest request =
                DistrictOuterClass.GetAllDistrictsRequest.newBuilder()
                        .build();
        DistrictOuterClass.GetAllDistrictsResponse response =
                districtServiceBlockingStub.getAllDistricts(request);
        List<DistrictOuterClass.District> districtList = response.getDistrictsList();
        List<District> districts = districtList.stream().map(districtMapper::fromGrpcClass).collect(Collectors.toList());
        return districts;
    }

    @GetMapping("/{id}")
    public District districtById(@PathVariable Long id){
        DistrictOuterClass.GetDistrictByIdRequest request =
                DistrictOuterClass.GetDistrictByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        DistrictOuterClass.GetDistrictByIdResponse response =
                districtServiceBlockingStub.getDistrictById(request);
        return districtMapper.fromGrpcClass(response.getDistrict());
    }

    @PostMapping
    public District createDistrict(@RequestBody District district) {
        DistrictOuterClass.DistrictRequest districtRequest = districtMapper.toGrpcDistrictRequest(district);

        DistrictOuterClass.SaveDistrictRequest request = DistrictOuterClass.SaveDistrictRequest.newBuilder()
                .setDistrict(districtRequest)
                .build();

        DistrictOuterClass.SaveDistrictResponse response = districtServiceBlockingStub.saveDistrict(request);
        return districtMapper.fromGrpcClass(response.getDistrict());
    }

}
