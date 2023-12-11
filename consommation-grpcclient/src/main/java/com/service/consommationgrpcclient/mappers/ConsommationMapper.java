package com.service.consommationgrpcclient.mappers;

import com.service.consommationgrpcclient.models.Bordereau;
import com.service.consommationgrpcclient.models.Consommation;
import com.service.consommationgrpcclient.stub.BordereauOuterClass;
import com.service.consommationgrpcclient.stub.ConsommationOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConsommationMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public ConsommationOuterClass.Consommation fromEntity(Consommation consommation)
    {
        System.out.println("entity in fromEntity "+consommation);
        Bordereau bordereau = consommation.getBordereau();
        System.out.println("bordereau "+bordereau);
        BordereauOuterClass.Bordereau b =modelMapper.map(bordereau,BordereauOuterClass.Bordereau
                .Builder.class).build();
        System.out.println("b "+b);
        ConsommationOuterClass.Consommation c = modelMapper.map(consommation, ConsommationOuterClass.Consommation.Builder.class)
                .setBordereau(b)
                .build();
        System.out.println("c in fromEntity "+c);
        return c;
    }

    public Consommation fromGrpcRequest(ConsommationOuterClass.SaveConsommationRequest request){
        System.out.println("request in mapper "+request);
        Consommation consommation = modelMapper.map(request, Consommation.class);
        System.out.println("Consommation in mapper "+consommation);
        return consommation;
    }
    public Consommation fromGrpcClass(ConsommationOuterClass.Consommation consommation){

        return modelMapper.map(consommation, Consommation.class);
    }

    public ConsommationOuterClass.ConsommationRequest toGrpcRequest(Consommation consommation) {
        System.out.println("consommation "+consommation);
        Bordereau bordereau = consommation.getBordereau();
        System.out.println("bordereau "+bordereau);
        BordereauOuterClass.Bordereau b =modelMapper.map(bordereau,BordereauOuterClass.Bordereau
                .Builder.class).build();
        System.out.println("b "+b);
        ConsommationOuterClass.ConsommationRequest request = modelMapper.map(consommation, ConsommationOuterClass.ConsommationRequest.Builder.class)
                .setBordereau(b)
                .build();
        System.out.println("request "+request);
        return request;
    }
}
