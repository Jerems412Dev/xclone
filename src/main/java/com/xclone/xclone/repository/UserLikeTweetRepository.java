package com.xclone.xclone.repository;

import com.xclone.xclone.model.UserLikeTweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLikeTweetRepository extends JpaRepository<UserLikeTweet, Integer> {
}
