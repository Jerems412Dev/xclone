package com.xclone.xclone.service;

import com.xclone.xclone.dto.UserFollowDTO;
import com.xclone.xclone.mapper.UserFollowMapper;
import com.xclone.xclone.repository.UserFollowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFollowService {
    @Autowired
    private UserFollowRepository userFollowrepos;
    @Autowired
    private UserFollowMapper userFollowmapper;

    public List<UserFollowDTO> getAllUserFollows() {
        return userFollowmapper.userListToUserFollowDTOList(userFollowrepos.findAll());
    }

    public UserFollowDTO getUserFollowById(int id) {
        return userFollowmapper.toUserFollowDTO(userFollowrepos.findById(id).get());
    }

    public void createUserFollow(UserFollowDTO userFollow) {
        userFollowrepos.save(userFollowmapper.fromUserFollowDTO(userFollow));
    }
}
