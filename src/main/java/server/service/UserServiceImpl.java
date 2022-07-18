package server.service;

import server.model.User;

import java.util.List;

public interface UserServiceImpl {
    List<User> findAll();
}
