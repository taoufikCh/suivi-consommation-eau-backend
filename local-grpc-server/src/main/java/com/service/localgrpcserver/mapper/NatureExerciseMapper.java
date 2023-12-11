package com.service.localgrpcserver.mapper;

import com.service.localgrpcserver.entities.Local;
import com.service.localgrpcserver.entities.NatureExercise;
import com.service.localgrpcserver.stub.LocalOuterClass;
import com.service.localgrpcserver.stub.NatureExerciseOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class NatureExerciseMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public NatureExerciseOuterClass.NatureExercise fromEntity(NatureExercise natureExercise){
        return modelMapper.map(natureExercise, NatureExerciseOuterClass.NatureExercise.Builder.class).build();
    }

    public NatureExercise fromGrpcClass(NatureExerciseOuterClass.NatureExercise grpcNature){
        System.out.println("grpcNature in n mapper "+grpcNature);
        return modelMapper.map(grpcNature, NatureExercise.class);
    }
}
