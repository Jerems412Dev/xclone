package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "media")
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMedia;
    private MediaType type;
    private String link;

    // All relatioships

    @ManyToOne
    @JoinColumn(name="tweet_id")
    private Tweet tweet;
}
