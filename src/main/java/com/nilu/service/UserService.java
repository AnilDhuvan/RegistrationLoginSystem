package com.nilu.service;

import java.util.List;

import com.nilu.dto.UserDto;
import com.nilu.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
