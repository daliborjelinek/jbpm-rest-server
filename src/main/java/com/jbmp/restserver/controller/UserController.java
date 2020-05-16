package com.jbmp.restserver.controller;

import com.jbmp.restserver.data.User;
import com.jbmp.restserver.data.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/oauth")
    public User getOAuth() {
        return new User("Brno", "bartutomas@gmail.com", "Tomas", "Bartu", "pw==", "+421731", "male", "Rybarska 32");
    }

    @GetMapping
    public Users users() {
        List<User> users = Arrays.asList(
                new User("Brno", "alena@gmail.com", "Alena", "Nejaka", "pwx==", "+421731", "female", "Vlhka 32"),
                new User("Brno", "bartutomas@gmail.com", "Tomas", "Bartu", "pw==", "+421731", "male", "Rybarska")
        );
        return new Users(users);
    }

    @PostMapping("/save")
    public User user(@RequestBody User user) {
        logger.info("Saving " + user);
        return user;
    }

}
