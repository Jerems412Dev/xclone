package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TweetLockDTO {
    private Long id;
    private UserDTO tweetlocker;
    private TweetDTO locked;
}
