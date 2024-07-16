package com.xclone.xclone.dto;

import com.xclone.xclone.model.MediaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaDTO {
    private long idMedia;
    private MediaType type;
    private String link;
    private TweetDTO tweet;
}
