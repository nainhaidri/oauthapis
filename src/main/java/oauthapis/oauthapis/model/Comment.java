package oauthapis.oauthapis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
    private int id, postId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("post_id")
    public int getPostId() {
        return postId;
    }

    @JsonProperty("post_id")
    public void setPostId(int postId) {
        this.postId = postId;
    }

    private String name, email, body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comment() {

    }

    public Comment(int id, int postId, String name, String email, String body) {
        this.id = id;
        this.postId = postId;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
