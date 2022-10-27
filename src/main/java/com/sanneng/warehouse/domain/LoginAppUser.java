package com.sanneng.warehouse.domain;

import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * warehouse
 * SoulLose
 * 2022-10-26 16:27
 */
public class LoginAppUser implements UserDetails {
    
    
    private AppUser appUser;
    
    public LoginAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
    
    
    @Override
    public String getUsername() {
        return appUser.getUsername();
    }
    
    @Override
    public String getPassword() {
        return appUser.getPassword();
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return appUser.getRoles().stream().map(appRole -> new SimpleGrantedAuthority(appRole.getName())).collect(Collectors.toList());
    }
    
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    
    
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    
    @Override
    public boolean isEnabled() {
        return true;
    }
}
