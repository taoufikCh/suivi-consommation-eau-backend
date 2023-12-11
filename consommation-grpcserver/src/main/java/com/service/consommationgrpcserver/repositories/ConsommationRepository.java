package com.service.consommationgrpcserver.repositories;

import com.service.consommationgrpcserver.models.Consommation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ConsommationRepository extends JpaRepository<Consommation, Long> {
    List<Consommation> getConsommationByCompteurId(Long compteurId);


    @Query("SELECT c FROM Consommation c " +
            "WHERE (:compteursID IS null OR c.compteurId IN :compteursID) " +
            "AND (:startDate IS NULL OR :endDate IS NULL OR c.dateDebut BETWEEN :startDate AND :endDate)")
    List<Consommation> findByCompteursAndPeriod(
            @Param("compteursID") List<Long> compteursID,
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate
    );


    List<Consommation> findByCompteurIdInAndDateDebutBetween(
            List<Long> compteurIds, LocalDate startDate, LocalDate endDate
    );
    List<Consommation> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);
    List<Consommation> findByCompteurIdIn( List<Long> compteurIds );
    List<Consommation> findByDateDebutBefore( LocalDate endDate );
    List<Consommation> findByDateDebutAfter( LocalDate startDate );
    List<Consommation> findByCompteurIdInAndDateDebutBefore(List<Long> compteurIds, LocalDate endDate);
    List<Consommation> findByCompteurIdInAndDateDebutAfter(List<Long> compteurIds, LocalDate startDate);

}
