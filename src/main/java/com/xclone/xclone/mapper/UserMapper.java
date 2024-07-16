package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.RegisterDTO;
import com.xclone.xclone.dto.UserDTO;
import com.xclone.xclone.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    UserDTO toUserDTO(User user);
    List<UserDTO> userEntityListToUserDTOList(List<User> list);
    User fromUserDTO(UserDTO userDTO);
    User fromRegisterDTO(RegisterDTO register);
}
