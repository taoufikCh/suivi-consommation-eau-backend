package com.service.localgrpcclient.services;

import com.service.localgrpcclient.entities.Region;
import com.service.localgrpcclient.mapper.DistrictMapper;
import com.service.localgrpcclient.mapper.RegionMapper;
import com.service.localgrpcclient.stub.RegionOuterClass;
import com.service.localgrpcclient.stub.RegionServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class RegionService {
    @Autowired
    private RegionMapper regionMapper;

    @GrpcClient(value = "localService")
    private RegionServiceGrpc.RegionServiceBlockingStub regionServiceBlockingStub;


    public RegionOuterClass.Region regionById(Long id){
        RegionOuterClass.GetRegionByIdRequest request =
                RegionOuterClass.GetRegionByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        RegionOuterClass.GetRegionByIdResponse response =
                regionServiceBlockingStub.getRegionById(request);
        RegionOuterClass.Region region = response.getRegion();
        return region;
    }
}
