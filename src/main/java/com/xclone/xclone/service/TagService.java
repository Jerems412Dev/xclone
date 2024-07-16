package com.xclone.xclone.service;

import com.xclone.xclone.dto.TagDTO;
import com.xclone.xclone.mapper.TagMapper;
import com.xclone.xclone.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired
    private TagRepository tagrepos;
    @Autowired
    private TagMapper tagmapper;

    public List<TagDTO> getAllTags() {
        return tagmapper.userListToTagDTOList(tagrepos.findAll());
    }

    public TagDTO getTagById(int id) {
        return tagmapper.toTagDTO(tagrepos.findById(id).get());
    }

    public void createTag(TagDTO tag) {
        tagrepos.save(tagmapper.fromTagDTO(tag));
    }
}
