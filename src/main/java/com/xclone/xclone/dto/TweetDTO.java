package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TweetDTO {
    private long idTweet;
    private String content;
    private LocalDateTime publishDate;
    private UserDTO autor;
    private Set<UserLikeTweetDTO> tweetlikeds = new HashSet<>();
    private TweetDTO tweetParent;
    private Set<TweetDTO> responses = new HashSet<>();
    private Set<QuoteDTO> quotes = new HashSet<>();
    private Set<RepostDTO> reposts = new HashSet<>();
    private Set<MediaDTO> medias = new HashSet<>();
    private Set<TagDTO> tags = new HashSet<>();
    private Set<TweetLockDTO> lockers = new HashSet<>();
}
