package com.nilu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilu.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
