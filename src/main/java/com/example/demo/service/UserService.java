package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.repository.User;

public interface UserService {

    User save(User user);

    Optional<User> findById(String id);

    List<User> all();

    void deleteById(String id) throws Exception;

    User update(User user, String userId);
}
