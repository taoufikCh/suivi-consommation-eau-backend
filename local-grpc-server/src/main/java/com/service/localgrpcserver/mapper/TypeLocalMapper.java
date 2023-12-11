package com.service.localgrpcserver.mapper;

import com.service.localgrpcserver.entities.NatureExercise;
import com.service.localgrpcserver.entities.TypeLocal;
import com.service.localgrpcserver.stub.NatureExerciseOuterClass;
import com.service.localgrpcserver.stub.TypeLocalOuterClass;
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
