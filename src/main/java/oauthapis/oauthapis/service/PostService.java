package oauthapis.oauthapis.service;

import org.springframework.http.ResponseEntity;

import oauthapis.oauthapis.model.Post;

public interface PostService {
    ResponseEntity<Post[]> getAllPosts();

    ResponseEntity<Post[]> getPostsByUserId(int userId);
}
