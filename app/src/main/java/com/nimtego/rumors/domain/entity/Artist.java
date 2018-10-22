package com.nimtego.rumors.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Artist {
    private Integer artistId;
    private String artistName;
    private String artistViewUrl;
    private String previewUrl;
}
