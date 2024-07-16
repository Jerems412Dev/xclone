package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.UserLockDTO;
import com.xclone.xclone.model.UserLock;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserLockMapper {
    UserLockDTO toUserLockDTO(UserLock quote);
    List<UserLockDTO> userListToUserLockDTOList(List<UserLock> list);
    UserLock fromUserLockDTO(UserLockDTO quoteDTO);
}
