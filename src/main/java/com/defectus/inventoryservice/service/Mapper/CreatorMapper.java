package com.defectus.inventoryservice.service.Mapper;

import com.defectus.inventoryservice.dao.entities.Creator;
import com.defectus.inventoryservice.dto.CreatorDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {
    ModelMapper mapper = new ModelMapper();

    public CreatorDto fromCreatortoCreatorDto(Creator creator) {
        return mapper.map(creator,CreatorDto.class);
    }

    public Creator fromCreatordtotoCreator(CreatorDto creatorDto) {
        return mapper.map(creatorDto,Creator.class);
    }

}
