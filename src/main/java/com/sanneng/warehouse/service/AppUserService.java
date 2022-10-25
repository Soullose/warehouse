package com.sanneng.warehouse.service;

import com.sanneng.warehouse.domain.AppUser;

import java.util.List;

public interface AppUserService {

    AppUser saveAppUser(AppUser user);
    void addRoleToUser(String username,String roleName);
    AppUser getAppUser(String username);
    List<AppUser> getUsers();
}
