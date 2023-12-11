package com.service.localgrpcclient.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.service.localgrpcclient.entities.NatureExercise;
import com.service.localgrpcclient.entities.Region;
import com.service.localgrpcclient.entities.TypeLocal;
import com.service.localgrpcclient.enums.LocalStatus;
import com.service.localgrpcclient.enums.LocalStatusDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocalDto {
    private Long id;
    private String code;
    private String designation;
    private String adresse;
    private String longitude;
    private String latitude;
    private String image;
    //@JsonDeserialize(using = LocalStatusDeserializer.class)
    private LocalStatus etat;
    private NatureExercise nature_exercise;
    private TypeLocal type_local;
}
