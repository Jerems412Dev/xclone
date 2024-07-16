package com.xclone.xclone.service;

import com.xclone.xclone.dto.TweetLockDTO;
import com.xclone.xclone.mapper.TweetLockMapper;
import com.xclone.xclone.repository.TweetLockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetLockService {
    @Autowired
    private TweetLockRepository tweetLockrepos;
    @Autowired
    private TweetLockMapper tweetLockmapper;

    public List<TweetLockDTO> getAllTweetLocks() {
        return tweetLockmapper.userListToTweetLockDTOList(tweetLockrepos.findAll());
    }

    public TweetLockDTO getTweetLockById(int id) {
        return tweetLockmapper.toTweetLockDTO(tweetLockrepos.findById(id).get());
    }

    public void createTweetLock(TweetLockDTO tweetLock) {
        tweetLockrepos.save(tweetLockmapper.fromTweetLockDTO(tweetLock));
    }
}
