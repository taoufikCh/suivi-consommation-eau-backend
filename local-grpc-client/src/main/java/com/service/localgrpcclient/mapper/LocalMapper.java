package com.service.localgrpcclient.mapper;

import com.service.localgrpcclient.dto.LocalDto;
import com.service.localgrpcclient.entities.Local;
import com.service.localgrpcclient.entities.NatureExercise;
import com.service.localgrpcclient.entities.Region;
import com.service.localgrpcclient.entities.TypeLocal;
import com.service.localgrpcclient.stub.LocalOuterClass;
import com.service.localgrpcclient.stub.NatureExerciseOuterClass;
import com.service.localgrpcclient.stub.RegionOuterClass;
import com.service.localgrpcclient.stub.TypeLocalOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class LocalMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public LocalOuterClass.Local fromLocal(Local local){
        NatureExercise natureExercise = local.getNature_exercise();
        TypeLocal typeLocal = local.getType_local();
        Region region = local.getRegion();
        NatureExerciseOuterClass.NatureExercise n =modelMapper.map(natureExercise,NatureExerciseOuterClass.NatureExercise
                .Builder.class).build();

        System.out.println("natureexercice in mapper "+n);
        TypeLocalOuterClass.TypeLocal t = modelMapper.map(typeLocal,TypeLocalOuterClass.TypeLocal
                .Builder.class).build();
        System.out.println("type local in mapper "+t);
        RegionOuterClass.Region r = modelMapper.map(region,RegionOuterClass.Region.Builder.class).build();
        System.out.println("region in mapper "+r);

         LocalOuterClass.Local localMapped = modelMapper.map(local, LocalOuterClass.Local.Builder.class)
                 .setRegion(r)
                 .setNatureExercise(n)
                 .setTypeLocal(t)
                 .build();
        System.out.println("localMapped in mapper "+localMapped);
         return localMapped;
    }

    public Local fromGrpcLocalRequest(LocalOuterClass.LocalRequest localRequest){
        return modelMapper.map(localRequest, Local.class);
    }

    public Local fromGrpcLocal(LocalOuterClass.Local grpcLocal){
        NatureExerciseOuterClass.NatureExercise n = grpcLocal.getNatureExercise();
        NatureExercise natureExercise = modelMapper.map(n, NatureExercise.class);

        TypeLocalOuterClass.TypeLocal t = grpcLocal.getTypeLocal();
        TypeLocal typeLocal = modelMapper.map(t, TypeLocal.class);

        Local l = modelMapper.map(grpcLocal, Local.class);
                l.setType_local(typeLocal);
                l.setNature_exercise(natureExercise);

        System.out.println("local in mapper "+l);
        return l;
    }

    public LocalDto fromGrpcLocalDto(LocalOuterClass.Local grpcLocal){
        NatureExerciseOuterClass.NatureExercise n = grpcLocal.getNatureExercise();
        NatureExercise natureExercise = modelMapper.map(n, NatureExercise.class);

        TypeLocalOuterClass.TypeLocal t = grpcLocal.getTypeLocal();
        TypeLocal typeLocal = modelMapper.map(t, TypeLocal.class);

        LocalDto l = modelMapper.map(grpcLocal, LocalDto.class);
        l.setType_local(typeLocal);
        l.setNature_exercise(natureExercise);

        System.out.println("local in mapper "+l);
        return l;
    }
    public LocalOuterClass.LocalRequest toGrpcLocalRequest(Local local) {
        System.out.println("Local in mapper "+local);

        LocalOuterClass.LocalRequest localRequest = modelMapper.map(local, LocalOuterClass.LocalRequest.Builder.class).build();
        System.out.println("localRequest in mapper "+localRequest);
        return localRequest;
    }
}
