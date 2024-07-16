package com.xclone.xclone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "userlocks")
public class UserLock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "locker_id")
    private User locker;

    @ManyToOne
    @JoinColumn(name = "locked_id")
    private User locked;
}
