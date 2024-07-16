package com.xclone.xclone.service;

import com.xclone.xclone.dto.RegisterDTO;
import com.xclone.xclone.dto.UserDTO;
import com.xclone.xclone.mapper.UserMapper;
import com.xclone.xclone.model.User;
import com.xclone.xclone.repository.UserRepository;
import com.xclone.xclone.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        return user.map(UserPrincipal::new)
                .orElseThrow(() -> new UsernameNotFoundException("UserName not found: " + username));
    }

    public List<UserDTO> getAllUsers() {
        return userMapper.userEntityListToUserDTOList(userRepository.findAll());
    }

    public UserDTO getUserById(int id) {
        return userMapper.toUserDTO(userRepository.findById(id).get());
    }

    public void createUser(UserDTO user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(userMapper.fromUserDTO(user));
    }

    public void addUser(RegisterDTO register) {
        register.setPassword(passwordEncoder.encode(register.getPassword()));
        userMapper.toUserDTO(userRepository.save(userMapper.fromRegisterDTO(register)));
    }
}
