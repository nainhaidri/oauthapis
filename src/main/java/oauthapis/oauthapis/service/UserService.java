package oauthapis.oauthapis.service;

import org.springframework.http.ResponseEntity;

import oauthapis.oauthapis.model.User;

public interface UserService {
    ResponseEntity<User[]> getAllUsers();
}
