package com.service.compteurgrpcclient.models;

import com.service.compteurgrpcclient.enums.UniteMesure;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Compteur {


    private Long id;
    private String refCompteur;
    private String refContrat;
    private double maxConsommation;
    private String dateInstallation;
    private boolean etatCompteur;
    private String image;
    private Long localID;
    private UniteMesure uniteMesure;
}
