package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagDTO {
    private long idTag;
    private String content;
    private Set<TweetDTO> tweets = new HashSet<>();
}
