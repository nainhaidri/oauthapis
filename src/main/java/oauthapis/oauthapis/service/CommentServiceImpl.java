package oauthapis.oauthapis.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import oauthapis.oauthapis.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {
    private String commentResource = "https://gorest.co.in/public/v2";

    public ResponseEntity<Comment[]> getAllComments() {

        RestTemplate template = new RestTemplate();
        ResponseEntity<Comment[]> response = template.getForEntity(this.commentResource + "/comments", Comment[].class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response;
        } else {
            return null;
        }
    }

    public ResponseEntity<Comment[]> getCommentsByPostId(int postId) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Comment[]> response = template.getForEntity(
                this.commentResource + "/posts/" + postId + "/comments",
                Comment[].class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response;
        } else {
            return null;
        }
    }
}
