package com.defectus.inventoryservice.dao.repositories;

import com.defectus.inventoryservice.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
