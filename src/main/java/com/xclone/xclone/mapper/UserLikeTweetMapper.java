package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.UserLikeTweetDTO;
import com.xclone.xclone.model.UserLikeTweet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserLikeTweetMapper {
    UserLikeTweetDTO toUserLikeTweetDTO(UserLikeTweet userLikeTweet);
    List<UserLikeTweetDTO> userListToUserLikeTweetDTOList(List<UserLikeTweet> list);
    UserLikeTweet fromUserLikeTweetDTO(UserLikeTweetDTO userLikeTweetDTO);
}
