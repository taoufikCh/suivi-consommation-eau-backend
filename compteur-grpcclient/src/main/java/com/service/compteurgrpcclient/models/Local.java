package com.service.compteurgrpcclient.models;

import com.service.compteurgrpcclient.enums.LocalStatus;
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
    private LocalStatus etat;

}
