package com.service.consommationgrpcserver.mapper;

import com.service.consommationgrpcserver.dto.ConsommationDto;
import com.service.consommationgrpcserver.models.Bordereau;
import com.service.consommationgrpcserver.models.Consommation;
import com.service.consommationgrpcserver.stub.BordereauOuterClass;
import com.service.consommationgrpcserver.stub.ConsommationOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ConsommationMapper {

    private ModelMapper modelMapper=new ModelMapper();

    public ConsommationOuterClass.Consommation fromEntity(Consommation consommation)
    {
        System.out.println("entity in fromEntity "+consommation);
        Bordereau b = consommation.getBordereau();
        BordereauOuterClass.Bordereau bordereau = modelMapper.map(b, BordereauOuterClass.Bordereau.Builder.class).build();

        ConsommationOuterClass.Consommation c = modelMapper.map(consommation, ConsommationOuterClass.Consommation.Builder.class)
                .setBordereau(bordereau)
                .setDateDebut(consommation.getDateDebut().toString())
                .setDateFin(consommation.getDateFin().toString())
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

    public Consommation fromGrpcConsommationRequest(ConsommationOuterClass.ConsommationRequest request){
        System.out.println("request in mapper "+request);
        Consommation consommation = modelMapper.map(request, Consommation.class);
        consommation.setId(null);
        consommation.setDateDebut(LocalDate.parse(request.getDateDebut()));
        consommation.setDateFin(LocalDate.parse(request.getDateFin()));
        System.out.println("Consommation in mapper "+consommation);
        return consommation;
    }
    public ConsommationDto fromGrpcRequestToConsommationDto(ConsommationOuterClass.SaveConsommationRequest request){
        System.out.println("request in mapper "+request);
        ConsommationDto consommationDto = modelMapper.map(request, ConsommationDto.class);
        System.out.println("ConsommationDto in mapper "+consommationDto);
        return consommationDto;
    }

    public Consommation fromGrpcClass(ConsommationOuterClass.Consommation consommation){
        System.out.println("consommation in mapper "+consommation);

        Consommation c = modelMapper.map(consommation, Consommation.class);
        c.setDateDebut(LocalDate.parse(consommation.getDateDebut()));
        c.setDateFin(LocalDate.parse(consommation.getDateFin()));
        System.out.println("c in mapper "+c);
        return c;
    }


}
