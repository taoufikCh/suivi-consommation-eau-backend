package com.service.report.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class LocalDtos {
    private Long id;
    private String code;
    //private String designation;
    //private String adresse;
    //private String longitude;
    //private String latitude;
    //private String image;
    //@JsonDeserialize(using = LocalStatusDeserializer.class)
    //private LocalStatus etat;
    private NatureExercise nature_exercise;
    private TypeLocal type_local;
}
