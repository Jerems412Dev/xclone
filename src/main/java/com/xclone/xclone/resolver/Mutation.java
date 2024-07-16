package com.xclone.xclone.resolver;

import com.xclone.xclone.security.JwtService;
import com.xclone.xclone.service.*;
import com.xclone.xclone.dto.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;


@Controller
@AllArgsConstructor
public class Mutation {
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
    @Autowired
    private JwtService jwtService;
    private AuthenticationManager authenticationManager;

    @MutationMapping
    public void createMedia(@Argument MediaDTO mediaDTO) {
        mediaService.createMedia(mediaDTO);
    }

    @MutationMapping
    public void createQuote(@Argument QuoteDTO quoteDTO) {
        quoteService.createQuote(quoteDTO);
    }

    @MutationMapping
    public void createRepost(@Argument RepostDTO repostDTO) {
        repostService.createRepost(repostDTO);
    }

    @MutationMapping
    public void createTag(@Argument TagDTO tagDTO) {
        tagService.createTag(tagDTO);
    }

    @MutationMapping
    public void createTweetLock(@Argument TweetLockDTO tweetLockDTO) {
        tweetLockService.createTweetLock(tweetLockDTO);
    }

    @MutationMapping
    public void createTweet(@Argument TweetDTO tweetDTO) {
        tweetService.createTweet(tweetDTO);
    }

    @MutationMapping
    public void createUserFollow(@Argument UserFollowDTO userFollowDTO) {
        userFollowService.createUserFollow(userFollowDTO);
    }

    @MutationMapping
    public void createUserLikeTweet(@Argument UserLikeTweetDTO userLikeTweetDTO) {
        userLikeTweetService.createUserLikeTweet(userLikeTweetDTO);
    }

    @MutationMapping
    public void createUserLock(@Argument UserLockDTO userLockDTO) {
        userLockService.createUserLock(userLockDTO);
    }

    @MutationMapping
    public void createUser(@Argument UserDTO userDTO) {
        userService.createUser(userDTO);
    }

    @MutationMapping
    public String register(@Argument RegisterDTO register){
        if (register == null) {
            throw new IllegalArgumentException("Register input is null");
        }
        userService.addUser(register);
        return "Register successfully";
    }

    @MutationMapping
    public String login(@Argument LoginDTO login) {
        Authentication authenticate = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(login.getUsername(),login.getPassword()));
        if(authenticate.isAuthenticated()) {
            String token = jwtService.generateToken(login);
            return token;
        }else {
            throw new UsernameNotFoundException("invalid User Request");
        }
    }
}
