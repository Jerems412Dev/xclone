package com.xclone.xclone.service;

import com.xclone.xclone.dto.UserLockDTO;
import com.xclone.xclone.mapper.UserLockMapper;
import com.xclone.xclone.repository.UserLockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLockService {
    @Autowired
    private UserLockRepository userLockrepos;
    @Autowired
    private UserLockMapper userLockmapper;

    public List<UserLockDTO> getAllUserLocks() {
        return userLockmapper.userListToUserLockDTOList(userLockrepos.findAll());
    }

    public UserLockDTO getUserLockById(int id) {
        return userLockmapper.toUserLockDTO(userLockrepos.findById(id).get());
    }

    public void createUserLock(UserLockDTO userLock) {
        userLockrepos.save(userLockmapper.fromUserLockDTO(userLock));
    }
}
