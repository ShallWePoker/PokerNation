package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import server.model.User;
import server.service.UserServiceImpl;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Welcome to PokerNation, %s!", name);
    }

    @GetMapping("/get-all-users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }
}
