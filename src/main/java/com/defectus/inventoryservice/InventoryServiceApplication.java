package com.defectus.inventoryservice;

import com.defectus.inventoryservice.dao.entities.Creator;
import com.defectus.inventoryservice.dao.entities.Video;
import com.defectus.inventoryservice.dao.repositories.CreatorRepository;
import com.defectus.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository){
        return args -> {
            List<Creator>creators= List.of(Creator.builder().name("Hamid").email("hamid@gmail.com").build(),
                    Creator.builder().name("said").email("said@gmail.com").build()
                    );
            creatorRepository.saveAll(creators);

            List<Video>videos = List.of(Video.builder().name("Spring Boot Tuto").url("www.youtube.com/ytb-tuto").description("Spring Tuto ").creator(creators.get(0)).build()
            );
            videoRepository.saveAll(videos);
        };

    }
}
