package oauthapis.oauthapis.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import oauthapis.oauthapis.model.Post;

@Service
public class PostServiceImpl implements PostService {
    private String postResource = "https://gorest.co.in/public/v2";

    public ResponseEntity<Post[]> getAllPosts() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Post[]> response = template.getForEntity(this.postResource + "/posts", Post[].class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response;
        } else {
            return null;
        }
    }

    public ResponseEntity<Post[]> getPostsByUserId(int userId) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Post[]> response = template.getForEntity(this.postResource + "/users/" + userId + "/posts",
                Post[].class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response;
        } else {
            return null;
        }
    }
}
