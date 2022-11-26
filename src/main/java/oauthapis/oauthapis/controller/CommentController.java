package oauthapis.oauthapis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import oauthapis.oauthapis.model.Comment;
import oauthapis.oauthapis.service.CommentService;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping(path = "/comments", produces = "application/json")
    public ResponseEntity<Comment[]> getComments() {
        return this.commentService.getAllComments();
    }

    @GetMapping(path = "/posts/{postId}/comments", produces = "application/json")
    public ResponseEntity<Comment[]> getCommentsByPost(@PathVariable(value = "postId") int postId) {
        return this.commentService.getCommentsByPostId(postId);
    }
}
