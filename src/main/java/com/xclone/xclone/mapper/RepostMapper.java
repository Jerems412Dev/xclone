package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.RepostDTO;
import com.xclone.xclone.model.Repost;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RepostMapper {
    RepostDTO toRepostDTO(Repost repost);
    List<RepostDTO> userListToRepostDTOList(List<Repost> list);
    Repost fromRepostDTO(RepostDTO repostDTO);
}
