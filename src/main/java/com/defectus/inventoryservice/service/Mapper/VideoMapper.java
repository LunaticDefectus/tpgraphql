package com.defectus.inventoryservice.service.Mapper;

import com.defectus.inventoryservice.dao.entities.Creator;
import com.defectus.inventoryservice.dao.entities.Video;
import com.defectus.inventoryservice.dto.CreatorDto;
import com.defectus.inventoryservice.dto.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {
    ModelMapper mapper = new ModelMapper();

    public VideoDto fromVideotoVideoDto(Video video) {
        return mapper.map(video,VideoDto.class);
    }

    public Video fromVideodtotoVideo(VideoDto videoDto) {
        return mapper.map(videoDto,Video.class);
    }

}
