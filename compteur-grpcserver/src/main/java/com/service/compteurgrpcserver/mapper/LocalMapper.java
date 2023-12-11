package com.service.compteurgrpcserver.mapper;

import com.service.compteurgrpcserver.stub.LocalOuterClass;
import com.service.compteurgrpcserver.models.Local;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class LocalMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public LocalOuterClass.Local fromLocal(Local local){

        LocalOuterClass.Local l = modelMapper.map(local, LocalOuterClass.Local.Builder.class)
                .build();
        return l;
    }


    public Local fromGrpcLocal(LocalOuterClass.Local grpcLocal){

        Local l = modelMapper.map(grpcLocal, Local.class);
        System.out.println("l in mapper "+l);
        return l;
    }
}
