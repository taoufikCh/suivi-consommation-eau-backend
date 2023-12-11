package com.service.localgrpcclient.mapper;

import com.service.localgrpcclient.entities.NatureExercise;
import com.service.localgrpcclient.stub.NatureExerciseOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class NatureExerciseMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public NatureExerciseOuterClass.NatureExercise fromEntity(NatureExercise natureExercise){
        return modelMapper.map(natureExercise, NatureExerciseOuterClass.NatureExercise.Builder.class).build();
    }

    public NatureExercise fromGrpcClass(NatureExerciseOuterClass.NatureExercise grpcNature){
        return modelMapper.map(grpcNature, NatureExercise.class);
    }
}
