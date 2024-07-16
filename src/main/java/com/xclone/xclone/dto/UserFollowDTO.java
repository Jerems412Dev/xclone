package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFollowDTO {
    private Long id;
    private UserDTO follower;
    private UserDTO followed;
}
