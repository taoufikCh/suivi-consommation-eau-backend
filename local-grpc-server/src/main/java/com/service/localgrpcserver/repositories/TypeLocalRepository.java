package com.service.localgrpcserver.repositories;

import com.service.localgrpcserver.entities.TypeLocal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeLocalRepository extends JpaRepository<TypeLocal, Long> {
    void deleteByIdIn(List<Long> ids);
}
