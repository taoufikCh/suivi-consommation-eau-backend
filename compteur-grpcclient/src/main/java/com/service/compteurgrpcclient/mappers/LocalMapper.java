package com.service.compteurgrpcclient.mappers;

import com.service.compteurgrpcclient.models.Local;
import com.service.compteurgrpcclient.stub.LocalOuterClass;
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
