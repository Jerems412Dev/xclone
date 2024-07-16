package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tweetlocks")
public class TweetLock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "locker_id")
    private User tweetlocker;

    @ManyToOne
    @JoinColumn(name = "tweetlocked_id")
    private Tweet locked;
}
