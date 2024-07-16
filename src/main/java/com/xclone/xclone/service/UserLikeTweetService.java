package com.xclone.xclone.service;

import com.xclone.xclone.dto.UserLikeTweetDTO;
import com.xclone.xclone.mapper.UserLikeTweetMapper;
import com.xclone.xclone.repository.UserLikeTweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLikeTweetService {
    @Autowired
    private UserLikeTweetRepository userLikeTweetrepos;
    @Autowired
    private UserLikeTweetMapper userLikeTweetmapper;

    public List<UserLikeTweetDTO> getAllUserLikeTweets() {
        return userLikeTweetmapper.userListToUserLikeTweetDTOList(userLikeTweetrepos.findAll());
    }

    public UserLikeTweetDTO getUserLikeTweetById(int id) {
        return userLikeTweetmapper.toUserLikeTweetDTO(userLikeTweetrepos.findById(id).get());
    }

    public void createUserLikeTweet(UserLikeTweetDTO userLikeTweet) {
        userLikeTweetrepos.save(userLikeTweetmapper.fromUserLikeTweetDTO(userLikeTweet));
    }
}
