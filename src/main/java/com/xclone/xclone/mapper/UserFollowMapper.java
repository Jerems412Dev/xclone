package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.UserFollowDTO;
import com.xclone.xclone.model.UserFollow;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserFollowMapper {
    UserFollowDTO toUserFollowDTO(UserFollow userFollow);
    List<UserFollowDTO> userListToUserFollowDTOList(List<UserFollow> list);
    UserFollow fromUserFollowDTO(UserFollowDTO userFollowDTO);
}
