package com.nickzoos.springtestapp.repository;

import com.nickzoos.springtestapp.model.User;

import java.util.List;

public interface UserRepository extends BaseRepository<User>{

    User findUserByUserName(String name);

    List<User> findUserByUserInfoIsNull();
}
