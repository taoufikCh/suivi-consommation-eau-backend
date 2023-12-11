package com.service.compteurgrpcserver.models;

import com.service.compteurgrpcserver.enums.UniteMesure;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Compteur {

    @Id
    @GeneratedValue
    private Long id;
    private String refCompteur;
    private String refContrat;
    private double maxConsommation;
    private String dateInstallation;
    private boolean etatCompteur;
    private String image;
    private Long localID;
    @Enumerated(EnumType.STRING)
    private UniteMesure uniteMesure;
}
