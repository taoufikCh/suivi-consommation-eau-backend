package com.service.localgrpcserver.repositories;

import com.service.localgrpcserver.entities.Local;
import com.service.localgrpcserver.entities.NatureExercise;
import com.service.localgrpcserver.entities.Region;
import com.service.localgrpcserver.entities.TypeLocal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalRepository extends JpaRepository<Local, Long> {
    void deleteByIdIn(List<Long> ids);
    List<Local> getLocalByRegion(Region region);

    @Query("SELECT l FROM Local l " +
            "WHERE (:region IS NULL OR l.region = :region) " +
            "AND (:natureExercise IS NULL OR l.nature_exercise = :natureExercise) " +
            "AND (:typeLocal IS NULL OR l.type_local = :typeLocal)")
    List<Local> findLocalsByFilters(@Param("region") Region region,
                                    @Param("natureExercise") NatureExercise natureExercise,
                                    @Param("typeLocal") TypeLocal typeLocal);
}
