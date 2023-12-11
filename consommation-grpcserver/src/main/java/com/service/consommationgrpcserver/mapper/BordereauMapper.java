package com.service.consommationgrpcserver.mapper;

import com.service.consommationgrpcserver.dto.BordereauDto;
import com.service.consommationgrpcserver.models.Bordereau;
import com.service.consommationgrpcserver.models.Consommation;
import com.service.consommationgrpcserver.stub.BordereauOuterClass;
import com.service.consommationgrpcserver.stub.ConsommationOuterClass;
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

    public BordereauDto fromEntityToDto(Bordereau bordereau)
    {
        System.out.println("entity in fromEntity "+bordereau);
        BordereauDto dto = modelMapper.map(bordereau, BordereauDto.class);
        System.out.println("c in fromEntity "+dto);
        return dto;
    }

    public BordereauOuterClass.Bordereau fromEntityDto(Bordereau bordereau)
    {
        System.out.println("entity in fromEntity "+bordereau);
        BordereauOuterClass.Bordereau c = modelMapper.map(bordereau, BordereauOuterClass.Bordereau.Builder.class)

                .build();
        System.out.println("c in fromEntity "+c);
        return c;
    }

    /*public Bordereau fromGrpcRequest(BordereauOuterClass.SaveBordereauRequest request){
        System.out.println("request in mapper "+request);
        Bordereau bordereau = modelMapper.map(request, Bordereau.class);
        System.out.println("Bordereau in mapper "+bordereau);
        return bordereau;
    }*/

    public Bordereau fromGrpcRequest(BordereauOuterClass.BordereauRequest request){
        System.out.println("request in mapper "+request);
        Bordereau bordereau = modelMapper.map(request, Bordereau.class);
        //bordereau.setId(null);
        System.out.println("bordereau in mapper "+bordereau);
        return bordereau;
    }

    public Bordereau fromGrpcClass(BordereauOuterClass.Bordereau bordereau){

        return modelMapper.map(bordereau, Bordereau.class);
    }


}
