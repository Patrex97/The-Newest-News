package com.newestnews.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "response_comment")
public class ResponseComment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String content;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "response_comment_id")
  private Comment comment;
  
  private Timestamp createdAt;
  
  private Timestamp modifiedAt;

  public ResponseComment() {}

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

  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }
  
  public Timestamp getCreatedAt() {
	return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
	this.createdAt = createdAt;
  }
  
  public Timestamp getModifiedAt() {
	return modifiedAt;
  }

  public void setModifiedAt(Timestamp modifiedAt) {
	this.modifiedAt = modifiedAt;
  }
}
