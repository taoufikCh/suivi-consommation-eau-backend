package com.service.localgrpcclient.mapper;

import com.service.localgrpcclient.entities.District;
import com.service.localgrpcclient.stub.DistrictOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DistrictMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public DistrictOuterClass.District fromEntity(District district){
        return modelMapper.map(district, DistrictOuterClass.District.Builder.class).build();
    }
    public District fromGrpcDistrictRequest(DistrictOuterClass.DistrictRequest request){
        return modelMapper.map(request, District.class);
    }

    public DistrictOuterClass.DistrictRequest toGrpcDistrictRequest(District district) {

        return modelMapper.map(district, DistrictOuterClass.DistrictRequest.Builder.class).build();
    }

    public District fromGrpcClass(DistrictOuterClass.District district){
        return modelMapper.map(district, District.class);
    }
}
