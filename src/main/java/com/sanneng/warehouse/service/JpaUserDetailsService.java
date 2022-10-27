package com.sanneng.warehouse.service;

import com.sanneng.warehouse.domain.LoginAppUser;
import com.sanneng.warehouse.repo.AppUserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * warehouse
 * SoulLose
 * 2022-10-26 15:09
 */
@Service
public class JpaUserDetailsService implements UserDetailsService {
    
    private final AppUserRepo appUserRepo;
    
    public JpaUserDetailsService(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return appUserRepo
                .findAppUserByUsername(username)
                .map(LoginAppUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found " + username));
    }
}
