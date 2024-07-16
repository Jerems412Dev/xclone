package com.xclone.xclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {
    private long idUser;
    private String location;
    private String gender;
    private String birth;
    private String website;
    private String name;
    private String bio;
    private String profilePicture;
    private String coverPicture;
    private String username;
    private String password;
}
