package com.service.compteurgrpcserver.models;

import com.service.compteurgrpcserver.enums.LocalStatus;
import jakarta.persistence.*;
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
