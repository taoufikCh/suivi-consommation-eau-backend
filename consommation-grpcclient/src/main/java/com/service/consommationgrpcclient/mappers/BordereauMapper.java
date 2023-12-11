package com.service.consommationgrpcclient.mappers;

import com.service.consommationgrpcclient.models.Bordereau;
import com.service.consommationgrpcclient.stub.BordereauOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BordereauMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public BordereauOuterClass.Bordereau fromEntity(Bordereau bordereau)
    {
        System.out.println("entity in fromEntity "+bordereau);
        BordereauOuterClass.Bordereau c = modelMapper.map(bordereau, BordereauOuterClass.Bordereau.Builder.class)

                .build();
        System.out.println("c in fromEntity "+c);
        return c;
    }

    public Bordereau fromGrpcRequest(BordereauOuterClass.SaveBordereauRequest request){
        System.out.println("request in mapper "+request);
        Bordereau bordereau = modelMapper.map(request, Bordereau.class);
        System.out.println("Bordereau in mapper "+bordereau);
        return bordereau;
    }
    public Bordereau fromGrpcClass(BordereauOuterClass.Bordereau bordereau){

        return modelMapper.map(bordereau, Bordereau.class);
    }
    public BordereauOuterClass.BordereauRequest toGrpcRequest(Bordereau bordereau) {

        return modelMapper.map(bordereau, BordereauOuterClass.BordereauRequest.Builder.class).build();
    }
}
