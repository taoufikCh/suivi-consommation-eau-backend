package com.service.compteurgrpcclient.services;

import com.service.compteurgrpcclient.mappers.CompteurMapper;
import com.service.compteurgrpcclient.models.Compteur;
import com.service.compteurgrpcclient.models.Local;
import com.service.compteurgrpcclient.stub.CompteurOuterClass;
import com.service.compteurgrpcclient.stub.CompteurServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Compteurservice {
    @Autowired
     private CompteurMapper compteurMapper;
    @GrpcClient(value = "CompteurService")
    private CompteurServiceGrpc.CompteurServiceBlockingStub compteurServiceBlockingStub;
    public List<Compteur> getAllCompteur(){
        CompteurOuterClass.GetAllCompteursRequest request =
                CompteurOuterClass.GetAllCompteursRequest
                        .newBuilder().build();
        CompteurOuterClass.GetAllCompteursResponse response =
                compteurServiceBlockingStub.getAllCompteurs(request);
        List<CompteurOuterClass.Compteur> dataList = response.getCompteursList();
        List<Compteur> compteurs =
                dataList.stream().map(compteurMapper::fromGrpcClass).collect(Collectors.toList());
        return compteurs;
    }

    public  Compteur getCompteurById(Long id){
        CompteurOuterClass.GetCompteurByIdRequest request =
                CompteurOuterClass.GetCompteurByIdRequest.newBuilder()
                        .setId(id).build();
        CompteurOuterClass.GetCompteurByIdResponse response= compteurServiceBlockingStub.getCompteurById(request);
        Compteur compteur = compteurMapper.fromGrpcClass(response.getCompteur());
        return compteur;
    }

    public Compteur createCompteur(Compteur compteur){
        System.out.println("compteur : "+compteur);
        CompteurOuterClass.SaveCompteurRequest request = CompteurOuterClass.SaveCompteurRequest.newBuilder()
                .setImage(compteur.getImage())
                .setRefCompteur(compteur.getRefCompteur())
                .setRefContrat(compteur.getRefContrat())
                .setMaxConsommation(compteur.getMaxConsommation())
                .setDateInstallation(compteur.getDateInstallation())
                .setEtatCompteur(compteur.isEtatCompteur())
                .setLocalID(compteur.getLocalID())
                .setUniteMesure(CompteurOuterClass.UniteMesure.valueOf(compteur.getUniteMesure().name()))
                .build();
        System.out.println("request  in controller "+request);
        CompteurOuterClass.SaveCompteurResponse response = compteurServiceBlockingStub.saveCompteur(request);
        System.out.println("response  in controller "+response);
        return compteurMapper.fromGrpcClass(response.getCompteur());

    }

    public Compteur updateCompteur(Compteur compteur){
        System.out.println("compteur : "+compteur);
        CompteurOuterClass.Compteur compteurGrpc = compteurMapper.fromEntity(compteur);
        System.out.println("request "+compteurGrpc);
        CompteurOuterClass.UpdateCompteurRequest request = CompteurOuterClass.UpdateCompteurRequest.newBuilder()
                .setCompteur(compteurGrpc)
                .build();
        System.out.println("request  in controller "+request);
        CompteurOuterClass.UpdateCompteurResponse response = compteurServiceBlockingStub.updateCompteur(request);
        System.out.println("response  in controller "+response);
        return compteurMapper.fromGrpcClass(response.getCompteur());

    }

    public boolean deleteCompteur(Long id) {
        try{
            CompteurOuterClass.DeleteCompteurRequest request = CompteurOuterClass.DeleteCompteurRequest
                .newBuilder()
                .setId(id)
                .build();

             compteurServiceBlockingStub.deleteCompteur(request);
             return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Compteur> getCompteurByLocal(Long id){

        CompteurOuterClass.GetCompteursByLocalRequest request =
                CompteurOuterClass.GetCompteursByLocalRequest
                        .newBuilder()
                        .setLocalID(id)
                        .build();
        System.out.println("request get  "+request);
        CompteurOuterClass.GetCompteursByLocalResponse response =
                compteurServiceBlockingStub.getCompteursByLocal(request);
        System.out.println("response get "+response);
        List<CompteurOuterClass.Compteur> dataList = response.getCompteursList();
        System.out.println("response get all "+response);
        List<Compteur> compteurs =
                dataList.stream().map(compteurMapper::fromGrpcClass).collect(Collectors.toList());
        System.out.println("compteurs get all "+compteurs);
        return compteurs;
    }

    public List<Compteur> getCompteursByLocals(List<Local> locals) {
        List<Compteur> allCompteurs = new ArrayList<>();

        for (Local local : locals) {
            Long id = local.getId();
            CompteurOuterClass.GetCompteursByLocalRequest request =
                    CompteurOuterClass.GetCompteursByLocalRequest
                            .newBuilder()
                            .setLocalID(id)
                            .build();
            System.out.println("request for local ID " + id + ": " + request);

            CompteurOuterClass.GetCompteursByLocalResponse response =
                    compteurServiceBlockingStub.getCompteursByLocal(request);
            System.out.println("response for local ID " + id + ": " + response);

            List<CompteurOuterClass.Compteur> dataList = response.getCompteursList();
            System.out.println("response for local ID " + id + " (all): " + response);

            List<Compteur> compteurs = dataList.stream()
                    .map(compteurMapper::fromGrpcClass)
                    .collect(Collectors.toList());
            System.out.println("compteurs for local ID " + id + " (all): " + compteurs);

            allCompteurs.addAll(compteurs);
        }

        return allCompteurs;
    }



}
