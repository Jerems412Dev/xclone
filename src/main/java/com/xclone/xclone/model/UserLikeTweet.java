package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "userliketweet")
public class UserLikeTweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLike;

    //All relationships

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userliked;

    @ManyToOne
    @JoinColumn(name = "tweet_id")
    private Tweet tweetliked;
}
