package oauthapis.oauthapis.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import oauthapis.oauthapis.model.User;

@Service
public class UserServiceImpl implements UserService {
    private String userResource = "https://gorest.co.in/public/v2/users";

    public ResponseEntity<User[]> getAllUsers() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<User[]> response = template.getForEntity(this.userResource, User[].class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response;
        } else {
            return null;
        }
    }
}
