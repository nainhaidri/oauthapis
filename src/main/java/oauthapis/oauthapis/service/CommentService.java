package oauthapis.oauthapis.service;

import org.springframework.http.ResponseEntity;

import oauthapis.oauthapis.model.Comment;

public interface CommentService {
    ResponseEntity<Comment[]> getAllComments();

    ResponseEntity<Comment[]> getCommentsByPostId(int postId);
}