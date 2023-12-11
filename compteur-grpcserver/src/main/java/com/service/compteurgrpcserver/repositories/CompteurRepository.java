package com.service.compteurgrpcserver.repositories;

import com.service.compteurgrpcserver.models.Compteur;
import com.service.compteurgrpcserver.models.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompteurRepository extends JpaRepository<Compteur, Long> {

    List<Compteur> getCompteurByLocalID(Long localID);
}
