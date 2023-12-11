package com.service.consommationgrpcclient.services;

import com.service.consommationgrpcclient.mappers.BordereauMapper;
import com.service.consommationgrpcclient.mappers.ConsommationMapper;
import com.service.consommationgrpcclient.models.Bordereau;
import com.service.consommationgrpcclient.models.Consommation;
import com.service.consommationgrpcclient.stub.BordereauOuterClass;
import com.service.consommationgrpcclient.stub.BordereauServiceGrpc;

import com.service.consommationgrpcclient.stub.ConsommationOuterClass;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BordereauService {

    @Autowired
    private BordereauMapper bordereauMapper;
    @Autowired
    private ConsommationMapper consommationMapper;
    @GrpcClient(value = "ConsommationService")
    private BordereauServiceGrpc.BordereauServiceBlockingStub bordereauServiceBlockingStub;

    public List<Bordereau> getAllBordereaux(){

        BordereauOuterClass.GetAllBordereauxRequest request =
                BordereauOuterClass.GetAllBordereauxRequest
                        .newBuilder().build();
        System.out.println("request get all "+request);
        BordereauOuterClass.GetAllBordereauxResponse response =
                bordereauServiceBlockingStub.getAllBordereaus(request);
        System.out.println("response get all "+response);
        List<BordereauOuterClass.Bordereau> dataList = response.getBordereauxList();
        System.out.println("response get all "+response);
        List<Bordereau> bordereaux =
                dataList.stream().map(bordereauMapper::fromGrpcClass).collect(Collectors.toList());
        System.out.println("locals get all "+bordereaux);
        return bordereaux;
    }

    public  Bordereau getBordereauById(Long id){
        BordereauOuterClass.GetBordereauByIdRequest request =
                BordereauOuterClass.GetBordereauByIdRequest.newBuilder()
                        .setId(id).build();
        BordereauOuterClass.GetBordereauByIdResponse response= bordereauServiceBlockingStub.getBordereauById(request);
        Bordereau bordereau = bordereauMapper.fromGrpcClass(response.getBordereau());
        return bordereau;
    }

    public Bordereau createBordereau(Bordereau bordereau){
        System.out.println("bordereaux : "+bordereau);
        BordereauOuterClass.BordereauRequest bordereauRequest = bordereauMapper.toGrpcRequest(bordereau);
        BordereauOuterClass.SaveBordereauRequest request = BordereauOuterClass.SaveBordereauRequest.newBuilder()
                .setBordereauRequest(bordereauRequest)
                .build();
        System.out.println("request  in controller "+request);
        BordereauOuterClass.SaveBordereauResponse response = bordereauServiceBlockingStub.saveBordereau(request);
        System.out.println("response  in controller "+response);
        return bordereauMapper.fromGrpcClass(response.getBordereau());

    }

    public Bordereau updateBordereau(Bordereau bordereau){
        System.out.println("bordereau : "+bordereau);
        BordereauOuterClass.Bordereau bordereauGrpc = bordereauMapper.fromEntity(bordereau);
        System.out.println("request "+bordereauGrpc);
        BordereauOuterClass.UpdateBordereauRequest request = BordereauOuterClass.UpdateBordereauRequest.newBuilder()
                .setBordereau(bordereauGrpc)
                .build();
        System.out.println("request  in controller "+request);
        BordereauOuterClass.UpdateBordereauResponse response = bordereauServiceBlockingStub.updateBordereau(request);
        System.out.println("response  in controller "+response);
        return bordereauMapper.fromGrpcClass(response.getBordereau());

    }

    public boolean deleteBordereau(Long id) {
        try{
            BordereauOuterClass.DeleteBordereauRequest request = BordereauOuterClass.DeleteBordereauRequest
                    .newBuilder()
                    .setId(id)
                    .build();

            bordereauServiceBlockingStub.deleteBordereau(request);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public String getCurrentDate() {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(currentDate);
    }

    public Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis()); // Returns the current timestamp
    }
   /* public void addFactureToBordereau(Long id, Consommation facture){
        try {
            System.out.println("facture "+facture);
            ConsommationOuterClass.Consommation consommation = consommationMapper.fromEntity(facture);
            System.out.println("consommation facture "+consommation);
            BordereauOuterClass.AddFactureRequest request = BordereauOuterClass.AddFactureRequest
                    .newBuilder()
                    .setId(id)
                    .setConsommation(consommation)
                    .build();
            System.out.println("request facture "+request);
            bordereauServiceBlockingStub.addFactureToBordereau(request);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/



}
