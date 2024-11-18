package com.defectus.inventoryservice.dao.repositories;

import com.defectus.inventoryservice.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator, Integer> {
}
