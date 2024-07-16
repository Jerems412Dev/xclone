package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    //All relationships

    @OneToMany(mappedBy = "follower")
    private Set<UserFollow> following = new HashSet<>();

    @OneToMany(mappedBy = "followed")
    private Set<UserFollow> followers = new HashSet<>();

    @OneToMany(mappedBy = "locker")
    private Set<UserLock> locking = new HashSet<>();

    @OneToMany(mappedBy = "locked")
    private Set<UserLock> lockers = new HashSet<>();

    @OneToMany(mappedBy = "userliked")
    private Set<UserLikeTweet> userlikeds = new HashSet<>();

    @OneToMany(mappedBy = "autor")
    private Set<Tweet> tweet = new HashSet<>();

    @OneToMany(mappedBy = "tweetlocker")
    private Set<TweetLock> tweetlocking = new HashSet<>();
}
