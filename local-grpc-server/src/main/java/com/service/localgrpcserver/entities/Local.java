package com.service.localgrpcserver.entities;

import com.service.localgrpcserver.enums.LocalStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Local {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String designation;
    private String adresse;
    private String longitude;
    private String latitude;
    private String image;
    @ManyToOne
    private Region region;
    @Enumerated(EnumType.STRING)
    private LocalStatus etat;
    @ManyToOne
    private NatureExercise nature_exercise;
    @ManyToOne
    private TypeLocal type_local;

}
