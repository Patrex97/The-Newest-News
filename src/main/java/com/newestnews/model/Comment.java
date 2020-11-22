package com.newestnews.model;



import javax.persistence.*;
import java.util.List;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToMany(mappedBy = "comment")
    @Column(name = "comment_id")
    private List<ResponseComment> response_comment;


    public Comment() {}


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public List<ResponseComment> getResponseComment() {
        return response_comment;
    }


    public void setResponseComment(List<ResponseComment> responseComment) {
        this.response_comment = responseComment;
    }












}

