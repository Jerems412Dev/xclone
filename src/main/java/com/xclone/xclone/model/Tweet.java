package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTweet;
    private String content;
    private LocalDateTime publishDate;

    //All relationships

    @ManyToOne
    @JoinColumn(name="user_id")
    private User autor;

    @OneToMany(mappedBy = "tweetliked")
    private Set<UserLikeTweet> tweetlikeds = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Tweet tweetParent;

    @OneToMany(mappedBy = "tweetParent", cascade = CascadeType.ALL)
    private Set<Tweet> responses = new HashSet<>();

    @OneToMany(mappedBy = "tweetQuoted")
    private Set<Quote> quotes = new HashSet<>();

    @OneToMany(mappedBy = "tweetReposted")
    private Set<Repost> reposts = new HashSet<>();

    @OneToMany(mappedBy = "tweet")
    private Set<Media> medias = new HashSet<>();

    @ManyToMany
    private Set<Tag> tags = new HashSet<>();

    @OneToMany(mappedBy = "locked")
    private Set<TweetLock> lockers = new HashSet<>();
}
