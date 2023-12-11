package com.service.consommationgrpcserver.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Bordereau {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String dateGeneration;
    @JsonIgnore
    @OneToMany(mappedBy = "bordereau",fetch = FetchType.EAGER)
    private List<Consommation> consommations;

    @Override
    public String toString() {
        return "Bordereau(id=" + id + ", code=" + code + ", dateGeneration=" + dateGeneration +")";
    }
}
