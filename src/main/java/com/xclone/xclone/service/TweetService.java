package com.xclone.xclone.service;

import com.xclone.xclone.dto.TweetDTO;
import com.xclone.xclone.mapper.TweetMapper;
import com.xclone.xclone.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetrepos;
    @Autowired
    private TweetMapper tweetmapper;

    public List<TweetDTO> getAllTweets() {
        return tweetmapper.userListToTweetDTOList(tweetrepos.findAll());
    }

    public TweetDTO getTweetById(int id) {
        return tweetmapper.toTweetDTO(tweetrepos.findById(id).get());
    }

    public void createTweet(TweetDTO tweet) {
        tweetrepos.save(tweetmapper.fromTweetDTO(tweet));
    }
}
