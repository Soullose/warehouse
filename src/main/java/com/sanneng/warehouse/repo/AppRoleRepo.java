package com.sanneng.warehouse.repo;

import com.sanneng.warehouse.domain.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepo extends JpaRepository<AppRole,Long> {
    AppRole findAppRoleByName(String name);
}
