package com.xclone.xclone.repository;

import com.xclone.xclone.model.UserLock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLockRepository extends JpaRepository<UserLock, Integer> {
}
