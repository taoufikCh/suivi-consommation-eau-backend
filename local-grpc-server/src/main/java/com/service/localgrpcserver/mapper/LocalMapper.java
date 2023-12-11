package com.service.localgrpcserver.mapper;

import com.service.localgrpcserver.entities.Local;
import com.service.localgrpcserver.entities.NatureExercise;
import com.service.localgrpcserver.entities.Region;
import com.service.localgrpcserver.entities.TypeLocal;
import com.service.localgrpcserver.stub.LocalOuterClass;
import com.service.localgrpcserver.stub.NatureExerciseOuterClass;
import com.service.localgrpcserver.stub.RegionOuterClass;
import com.service.localgrpcserver.stub.TypeLocalOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class LocalMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public LocalOuterClass.Local fromLocal(Local local){
        Region r = local.getRegion();
        RegionOuterClass.Region region = modelMapper.map(r, RegionOuterClass.Region.Builder.class).build();

        NatureExercise n = local.getNature_exercise();
        NatureExerciseOuterClass.NatureExercise natureExercise = modelMapper.map(n, NatureExerciseOuterClass.NatureExercise.Builder.class).build();

        TypeLocal t = local.getType_local();
        TypeLocalOuterClass.TypeLocal typeLocal = modelMapper.map(t, TypeLocalOuterClass.TypeLocal.Builder.class).build();

        LocalOuterClass.Local l = modelMapper.map(local, LocalOuterClass.Local.Builder.class)
                .setRegion(region)
                .setNatureExercise(natureExercise)
                .setTypeLocal(typeLocal)
                .build();
        return l;
    }

    public Local fromGrpcLocalRequest(LocalOuterClass.SaveLocalRequest localRequest){
        System.out.println("localRequest mapper "+localRequest);
        System.out.println("nature exercice mapper "+ localRequest.getNatureExercise());
        NatureExerciseOuterClass.NatureExercise n = localRequest.getNatureExercise();
        NatureExercise natureExercise = modelMapper.map(n, NatureExercise.class);

        TypeLocalOuterClass.TypeLocal t = localRequest.getTypeLocal();
        TypeLocal typeLocal = modelMapper.map(t, TypeLocal.class);

        Local l = modelMapper.map(localRequest, Local.class);
        l.setNature_exercise(natureExercise);
        l.setType_local(typeLocal);
        System.out.println("l in mapper "+l);
        return l;
    }

    public Local fromGrpcLocal(LocalOuterClass.Local grpcLocal){

        System.out.println("localRequest mapper "+grpcLocal);
        System.out.println("nature exercice mapper "+ grpcLocal.getNatureExercise());
        NatureExerciseOuterClass.NatureExercise n = grpcLocal.getNatureExercise();
        NatureExercise natureExercise = modelMapper.map(n, NatureExercise.class);

        TypeLocalOuterClass.TypeLocal t = grpcLocal.getTypeLocal();
        TypeLocal typeLocal = modelMapper.map(t, TypeLocal.class);

        Local l = modelMapper.map(grpcLocal, Local.class);
        l.setNature_exercise(natureExercise);
        l.setType_local(typeLocal);
        System.out.println("l in mapper "+l);
        return l;
    }
}
