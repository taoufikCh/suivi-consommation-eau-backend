package com.service.localgrpcserver.repositories;

import com.service.localgrpcserver.entities.NatureExercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NatureExerciseRepository extends JpaRepository<NatureExercise, Long> {
    void deleteByIdIn(List<Long> ids);
}
