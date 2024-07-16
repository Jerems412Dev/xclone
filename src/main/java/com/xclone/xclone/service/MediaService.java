package com.xclone.xclone.service;

import com.xclone.xclone.dto.MediaDTO;
import com.xclone.xclone.mapper.MediaMapper;
import com.xclone.xclone.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediarepos;
    @Autowired
    private MediaMapper mediamapper;

    public List<MediaDTO> getAllMedias() {
        return mediamapper.userListToMediaDTOList(mediarepos.findAll());
    }

    public MediaDTO getMediaById(int id) {
        return mediamapper.toMediaDTO(mediarepos.findById(id).get());
    }

    public void createMedia(MediaDTO media) {
        mediarepos.save(mediamapper.fromMediaDTO(media));
    }
}
