package com.xclone.xclone.service;

import com.xclone.xclone.dto.RepostDTO;
import com.xclone.xclone.mapper.RepostMapper;
import com.xclone.xclone.repository.RepostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepostService {
    @Autowired
    private RepostRepository repostrepos;
    @Autowired
    private RepostMapper repostmapper;

    public List<RepostDTO> getAllReposts() {
        return repostmapper.userListToRepostDTOList(repostrepos.findAll());
    }

    public RepostDTO getRepostById(int id) {
        return repostmapper.toRepostDTO(repostrepos.findById(id).get());
    }

    public void createRepost(RepostDTO repost) {
        repostrepos.save(repostmapper.fromRepostDTO(repost));
    }
}
