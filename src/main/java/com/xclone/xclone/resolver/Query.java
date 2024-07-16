package com.xclone.xclone.resolver;

import com.xclone.xclone.dto.*;
import com.xclone.xclone.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Query {
    @Autowired
    private MediaService mediaService;
    @Autowired
    private QuoteService quoteService;
    @Autowired
    private RepostService repostService;
    @Autowired
    private TagService tagService;
    @Autowired
    private TweetLockService tweetLockService;
    @Autowired
    private TweetService tweetService;
    @Autowired
    private UserFollowService userFollowService;
    @Autowired
    private UserLikeTweetService userLikeTweetService;
    @Autowired
    private UserLockService userLockService;
    @Autowired
    private UserService userService;

    @QueryMapping
    public List<MediaDTO> getAllMedia() {
        return mediaService.getAllMedias();
    }

    @QueryMapping
    public MediaDTO findMediaById(int id) {
        return mediaService.getMediaById(id);
    }

    @QueryMapping
    public List<QuoteDTO> getAllQuote() {
        return quoteService.getAllQuotes();
    }

    @QueryMapping
    public QuoteDTO findQuoteById(int id) {
        return quoteService.getQuoteById(id);
    }

    @QueryMapping
    public List<RepostDTO> getAllRepost() {
        return repostService.getAllReposts();
    }

    @QueryMapping
    public RepostDTO findRepostById(int id) {
        return repostService.getRepostById(id);
    }

    @QueryMapping
    public List<TagDTO> getAllTag() {
        return tagService.getAllTags();
    }

    @QueryMapping
    public TagDTO findTagById(int id) {
        return tagService.getTagById(id);
    }

    @QueryMapping
    public List<TweetDTO> getAllTweet() {
        return tweetService.getAllTweets();
    }

    @QueryMapping
    public TweetDTO findTweetById(int id) {
        return tweetService.getTweetById(id);
    }

    @QueryMapping
    public List<TweetLockDTO> getAllTweetLock() {
        return tweetLockService.getAllTweetLocks();
    }

    @QueryMapping
    public TweetLockDTO findTweetLockById(int id) {
        return tweetLockService.getTweetLockById(id);
    }

    @QueryMapping
    public List<UserFollowDTO> getAllUserFollow() {
        return userFollowService.getAllUserFollows();
    }

    @QueryMapping
    public UserFollowDTO findUserFollowById(int id) {
        return userFollowService.getUserFollowById(id);
    }

    @QueryMapping
    public List<UserLikeTweetDTO> getAllUserLikeTweet() {
        return userLikeTweetService.getAllUserLikeTweets();
    }

    @QueryMapping
    public UserLikeTweetDTO findUserLikeTweetById(int id) {
        return userLikeTweetService.getUserLikeTweetById(id);
    }

    @QueryMapping
    public List<UserLockDTO> getAllUserLock() {
        return userLockService.getAllUserLocks();
    }

    @QueryMapping
    public UserLockDTO findUserLockById(int id) {
        return userLockService.getUserLockById(id);
    }

    @QueryMapping
    public List<UserDTO> getAllUser() {
        return userService.getAllUsers();
    }

    @QueryMapping
    public UserDTO findUserById(int id) {
        return userService.getUserById(id);
    }
}
