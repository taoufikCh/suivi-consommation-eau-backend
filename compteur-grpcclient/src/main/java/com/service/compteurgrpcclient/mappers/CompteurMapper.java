package com.service.compteurgrpcclient.mappers;

import com.service.compteurgrpcclient.models.Compteur;
import com.service.compteurgrpcclient.stub.CompteurOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CompteurMapper {

    private ModelMapper modelMapper=new ModelMapper();

    public CompteurOuterClass.Compteur fromEntity(Compteur compteur)
    {
        return modelMapper.map(compteur, CompteurOuterClass.Compteur.Builder.class)
                .build();
    }
    public Compteur fromGrpcCompteurRequest(CompteurOuterClass.SaveCompteurRequest request){
        return modelMapper.map(request, Compteur.class);
    }

    public Compteur fromGrpcClass(CompteurOuterClass.Compteur compteur){

        return modelMapper.map(compteur, Compteur.class);
    }
}
