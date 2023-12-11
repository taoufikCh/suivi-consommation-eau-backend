package com.service.localgrpcserver.mapper;

import com.service.localgrpcserver.entities.District;
import com.service.localgrpcserver.entities.Local;
import com.service.localgrpcserver.entities.TypeLocal;
import com.service.localgrpcserver.stub.DistrictOuterClass;
import com.service.localgrpcserver.stub.LocalOuterClass;
import com.service.localgrpcserver.stub.TypeLocalOuterClass;
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

    public District fromGrpcClass(DistrictOuterClass.District district){
        return modelMapper.map(district, District.class);
    }
}
