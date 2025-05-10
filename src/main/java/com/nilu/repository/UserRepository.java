package com.nilu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilu.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
