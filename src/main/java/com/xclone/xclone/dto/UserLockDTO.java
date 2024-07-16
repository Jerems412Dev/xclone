package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLockDTO {
    private Long id;
    private UserDTO locker;
    private UserDTO locked;
}
