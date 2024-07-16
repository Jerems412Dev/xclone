package com.xclone.xclone.repository;

import com.xclone.xclone.model.TweetLock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetLockRepository extends JpaRepository<TweetLock, Integer> {
}
