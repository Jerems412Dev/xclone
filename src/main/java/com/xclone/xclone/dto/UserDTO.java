package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private long idUser;
    private String location;
    private String gender;
    private String birth;
    private String website;
    private String name;
    private String bio;
    private String profilePicture;
    private String coverPicture;
    private String username;
    private String password;
    private Set<UserFollowDTO> following = new HashSet<>();
    private Set<UserFollowDTO> followers = new HashSet<>();
    private Set<UserLockDTO> locking = new HashSet<>();
    private Set<UserLockDTO> lockers = new HashSet<>();
    private Set<UserLikeTweetDTO> userlikeds = new HashSet<>();
    private Set<TweetDTO> tweet = new HashSet<>();
    private Set<TweetLockDTO> tweetlocking = new HashSet<>();
}
