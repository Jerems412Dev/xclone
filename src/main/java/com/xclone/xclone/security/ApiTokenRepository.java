package com.xclone.xclone.security;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiTokenRepository extends JpaRepository<ApiToken, Integer> {
    ApiToken findByUsername(String username);
    Optional<ApiToken> findByToken(String token);
    Boolean existsByUsername(String username);
    Boolean existsByTokenAndIsValid(String token,Boolean isValid);
}
