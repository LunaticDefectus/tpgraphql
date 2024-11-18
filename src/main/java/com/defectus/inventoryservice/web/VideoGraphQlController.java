package com.defectus.inventoryservice.web;

import com.defectus.inventoryservice.dao.entities.Creator;
import com.defectus.inventoryservice.dao.entities.Video;
import com.defectus.inventoryservice.dao.repositories.CreatorRepository;
import com.defectus.inventoryservice.dao.repositories.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@AllArgsConstructor
@Controller
public class VideoGraphQlController {

    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;

    @QueryMapping
    public List<Video> videoList(){
        return videoRepository.findAll();
    }
    @QueryMapping
    public Creator creatorById(@Argument Integer id) {
        return creatorRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }

    @MutationMapping
    public Creator saveCreator(@Argument CreatorRequest creator) {
        return creatorRepository.save(creator);
    }

    @MutationMapping
    public Video saveVideo(@Argument VideoRequest video) {
        return videoRepository.save(video);
    }

}
