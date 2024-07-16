package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Quote extends Tweet {
    //All relationships

    @ManyToOne
    @JoinColumn(name = "tweetQuoted_id")
    private Tweet tweetQuoted;
}
