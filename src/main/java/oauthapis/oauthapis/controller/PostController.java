package oauthapis.oauthapis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import oauthapis.oauthapis.model.Post;
import oauthapis.oauthapis.service.PostService;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(path = "/posts", produces = "application/json")
    public ResponseEntity<Post[]> getPosts() {
        return postService.getAllPosts();
    }

    @GetMapping(path = "/users/{userId}/posts", produces = "application/json")
    public ResponseEntity<Post[]> getPostsByUser(@PathVariable(value = "userId") int userId) {
        return postService.getPostsByUserId(userId);
    }
}
