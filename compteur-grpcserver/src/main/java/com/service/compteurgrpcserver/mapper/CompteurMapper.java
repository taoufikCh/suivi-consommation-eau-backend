package com.service.compteurgrpcserver.mapper;

import com.service.compteurgrpcserver.enums.UniteMesure;
import com.service.compteurgrpcserver.models.Compteur;
import com.service.compteurgrpcserver.stub.CompteurOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CompteurMapper {

    private ModelMapper modelMapper=new ModelMapper();

    public CompteurOuterClass.Compteur fromEntity(Compteur compteur)
    {
        System.out.println("compteur in fromEntity "+compteur);
        CompteurOuterClass.Compteur c = modelMapper.map(compteur, CompteurOuterClass.Compteur.Builder.class)
                .setRefCompteur(compteur.getRefCompteur())
                .setRefContrat(compteur.getRefContrat())
                .build();
        System.out.println("c in fromEntity "+c);
        return c;
    }
    public Compteur fromGrpcCompteurRequest(CompteurOuterClass.SaveCompteurRequest request){
        System.out.println("request in mapper "+request);
        Compteur compteur = modelMapper.map(request, Compteur.class);
        compteur.setId(null);
        compteur.setRefCompteur(request.getRefCompteur());
        compteur.setRefContrat(request.getRefContrat());
        compteur.setMaxConsommation(request.getMaxConsommation());
        compteur.setDateInstallation(request.getDateInstallation());
        compteur.setEtatCompteur(request.getEtatCompteur());
        compteur.setUniteMesure(UniteMesure.valueOf(request.getUniteMesure().name()));
        System.out.println("compteur in mapper "+compteur);
        return compteur;
    }

    public Compteur fromGrpcClass(CompteurOuterClass.Compteur compteur){

        return modelMapper.map(compteur, Compteur.class);
    }

}
