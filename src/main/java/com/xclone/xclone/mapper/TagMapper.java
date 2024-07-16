package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.TagDTO;
import com.xclone.xclone.model.Tag;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {
    TagDTO toTagDTO(Tag tag);
    List<TagDTO> userListToTagDTOList(List<Tag> list);
    Tag fromTagDTO(TagDTO tagDTO);
}
