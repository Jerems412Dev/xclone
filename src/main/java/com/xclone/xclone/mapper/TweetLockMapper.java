package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.TweetLockDTO;
import com.xclone.xclone.model.TweetLock;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TweetLockMapper {
    TweetLockDTO toTweetLockDTO(TweetLock tweetLock);
    List<TweetLockDTO> userListToTweetLockDTOList(List<TweetLock> list);
    TweetLock fromTweetLockDTO(TweetLockDTO tweetLockDTO);
}
