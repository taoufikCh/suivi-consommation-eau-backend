package com.service.consommationgrpcclient.services;

import com.service.consommationgrpcclient.mappers.ConsommationMapper;
import com.service.consommationgrpcclient.models.Consommation;
import com.service.consommationgrpcclient.stub.ConsommationOuterClass;
import com.service.consommationgrpcclient.stub.ConsommationServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsommationService {

    @Autowired
    private ConsommationMapper consommationMapper;
    @GrpcClient(value = "ConsommationService")
    private ConsommationServiceGrpc.ConsommationServiceBlockingStub consommationServiceBlockingStub;

    public List<Consommation> getAllConsommations(){

        ConsommationOuterClass.GetAllConsommationsRequest request =
                ConsommationOuterClass.GetAllConsommationsRequest
                        .newBuilder().build();
        System.out.println("request get all "+request);
        ConsommationOuterClass.GetAllConsommationsResponse response =
                consommationServiceBlockingStub.getAllConsommations(request);
        System.out.println("response get all "+response);
        List<ConsommationOuterClass.Consommation> dataList = response.getConsommationsList();
        System.out.println("response get all "+response);
        List<Consommation> consommations =
                dataList.stream().map(consommationMapper::fromGrpcClass).collect(Collectors.toList());
        System.out.println("locals get all "+consommations);
        return consommations;
    }

    public  Consommation getConsommationById(Long id){
        ConsommationOuterClass.GetConsommationByIdRequest request =
                ConsommationOuterClass.GetConsommationByIdRequest.newBuilder()
                        .setId(id).build();
        ConsommationOuterClass.GetConsommationByIdResponse response= consommationServiceBlockingStub.getConsommationById(request);
        Consommation consommation = consommationMapper.fromGrpcClass(response.getConsommation());
        return consommation;
    }

    public Consommation createConsommation(Consommation consommation){
        System.out.println("Consommation : "+consommation);
        consommation.setPeriode(consommation.getDateDebut()+"-"+consommation.getDateFin());
        consommation.setQuantite(consommation.getNouveauIndex()-consommation.getAncienIndex());
        System.out.println("quantity : "+consommation.getQuantite());
        ConsommationOuterClass.ConsommationRequest consommationRequest = consommationMapper.toGrpcRequest(consommation);
        System.out.println("consommationRequest : "+consommationRequest);
        ConsommationOuterClass.SaveConsommationRequest request = ConsommationOuterClass.SaveConsommationRequest.newBuilder()
                .setConsommationRequest(consommationRequest)
                .build();
        System.out.println("request  in controller "+request);
        ConsommationOuterClass.SaveConsommationResponse response = consommationServiceBlockingStub.saveConsommation(request);
        System.out.println("response  in controller "+response);
        return consommationMapper.fromGrpcClass(response.getConsommation());

    }

    public Consommation updateConsommation(Consommation consommation){
        System.out.println("Consommation : "+consommation);
        consommation.setQuantite(consommation.getNouveauIndex()-consommation.getAncienIndex());
        ConsommationOuterClass.Consommation consommationGrpc = consommationMapper.fromEntity(consommation);
        System.out.println("request "+consommationGrpc);
        ConsommationOuterClass.UpdateConsommationRequest request = ConsommationOuterClass.UpdateConsommationRequest.newBuilder()
                .setConsommation(consommationGrpc)
                .build();
        System.out.println("request  in controller "+request);
        ConsommationOuterClass.UpdateConsommationResponse response = consommationServiceBlockingStub.updateConsommation(request);
        System.out.println("response  in controller "+response);
        return consommationMapper.fromGrpcClass(response.getConsommation());

    }

    public boolean deleteConsommation(Long id) {
        try{
            ConsommationOuterClass.DeleteConsommationRequest request = ConsommationOuterClass.DeleteConsommationRequest
                    .newBuilder()
                    .setId(id)
                    .build();

            consommationServiceBlockingStub.deleteConsommation(request);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Consommation> getCosommationsByCompteur(Long id){

        ConsommationOuterClass.GetConsommationsByCompteurRequest request =
                ConsommationOuterClass.GetConsommationsByCompteurRequest
                        .newBuilder()
                        .setCompteurID(id)
                        .build();
        System.out.println("request get  "+request);
        ConsommationOuterClass.GetConsommationsByCompteurResponse response =
                consommationServiceBlockingStub.getConsommationsByCompteur(request);
        System.out.println("response get "+response);
        List<ConsommationOuterClass.Consommation> dataList = response.getConsommationsList();
        System.out.println("response get all "+response);
        List<Consommation> consommations =
                dataList.stream().map(consommationMapper::fromGrpcClass).collect(Collectors.toList());
        System.out.println("consommations get all "+consommations);
        return consommations;
    }
    public List<Consommation> getCosommationsByFilters(List<Long> compteursId, String dateDebut, String dateFin) {

        ConsommationOuterClass.ConsommationFilterRequest request =
                ConsommationOuterClass.ConsommationFilterRequest
                        .newBuilder()
                        .addAllCompteurId(compteursId)
                        .setDateDebut(dateDebut)
                        .setDateFin(dateFin)
                        .build();
        System.out.println("request get  " + request);
        ConsommationOuterClass.ConsommationResponse response =
                consommationServiceBlockingStub.getConsommationByCompteursAndPeriod(request);
        System.out.println("response get "+response);
        List<ConsommationOuterClass.Consommation> dataList = response.getConsommationsList();
        System.out.println("response get all "+response);
        List<Consommation> consommations =
                dataList.stream().map(consommationMapper::fromGrpcClass).collect(Collectors.toList());
        System.out.println("consommations get all "+consommations);
        return consommations;
    }


}
