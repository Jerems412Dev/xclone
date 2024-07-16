package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.TweetDTO;
import com.xclone.xclone.model.Tweet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TweetMapper {
    TweetDTO toTweetDTO(Tweet tweet);
    List<TweetDTO> userListToTweetDTOList(List<Tweet> list);
    Tweet fromTweetDTO(TweetDTO tweetDTO);
}
