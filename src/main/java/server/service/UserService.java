package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.model.User;
import server.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements UserServiceImpl {
    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        var cities = (List<User>) repository.findAll();
        return cities;
    }
}
