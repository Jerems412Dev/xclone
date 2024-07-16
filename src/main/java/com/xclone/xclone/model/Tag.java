package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTag;
    private String content;

    //All retionshiss

    @ManyToMany
    private Set<Tweet> tweets = new HashSet<>();
}
