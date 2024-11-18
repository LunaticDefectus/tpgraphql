package com.defectus.inventoryservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VideoDto {
    private Integer id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;
}
