package com.sanneng.warehouse.service;

import com.sanneng.warehouse.domain.AppUser;
import com.sanneng.warehouse.repo.AppUserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class AppUserServiceImpl implements AppUserService{

    private final AppUserRepo appUserRepo;

    @Override
    public AppUser saveAppUser(AppUser user) {
        return appUserRepo.save(user);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppUser appUser = appUserRepo.findAppUserByUsername(username);

    }

    @Override
    public AppUser getAppUser(String username) {
        return null;
    }

    @Override
    public List<AppUser> getUsers() {
        return null;
    }
}
