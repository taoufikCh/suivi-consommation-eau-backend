package com.service.consommationgrpcserver.repositories;

import com.service.consommationgrpcserver.models.Bordereau;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BordereauRepository extends JpaRepository<Bordereau, Long> {
}
