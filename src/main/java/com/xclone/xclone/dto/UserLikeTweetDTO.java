package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLikeTweetDTO {
    private long idLike;
    private UserDTO userliked;
    private TweetDTO tweetliked;
}
