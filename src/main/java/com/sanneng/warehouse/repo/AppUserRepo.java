package com.sanneng.warehouse.repo;

import com.sanneng.warehouse.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findAppUserByUsername(String username);
}
