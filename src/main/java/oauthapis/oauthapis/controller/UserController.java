package oauthapis.oauthapis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import oauthapis.oauthapis.model.User;
import oauthapis.oauthapis.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users", produces = "application/json")
    public ResponseEntity<User[]> getUsers() {
        return userService.getAllUsers();
    }
}
