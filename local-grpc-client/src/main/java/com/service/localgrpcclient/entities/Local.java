package com.service.localgrpcclient.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
public class Local {

    private Long id;
    private String code;
    private String designation;
    private String adresse;
    private String longitude;
    private String latitude;
    private String image;
    private Region region;
    //@JsonDeserialize(using = LocalStatusDeserializer.class)
    private LocalStatus etat;
    private NatureExercise nature_exercise;
    private TypeLocal type_local;

}
