package com.service.localgrpcclient.mapper;

import com.service.localgrpcclient.entities.TypeLocal;
import com.service.localgrpcclient.stub.TypeLocalOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TypeLocalMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public TypeLocalOuterClass.TypeLocal fromEntity(TypeLocal typeLocal){
        return modelMapper.map(typeLocal, TypeLocalOuterClass.TypeLocal.Builder.class).build();
    }

    public TypeLocal fromGrpcClass(TypeLocalOuterClass.TypeLocal grpcEntity){
        return modelMapper.map(grpcEntity, TypeLocal.class);
    }
}
