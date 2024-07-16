package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Repost extends Tweet {

    //All relationships

    @ManyToOne
    @JoinColumn(name = "tweetReposted_id")
    private Tweet tweetReposted;
}
