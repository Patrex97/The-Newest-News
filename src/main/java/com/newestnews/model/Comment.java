package com.newestnews.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;
import java.sql.Timestamp;

@Entity
@Table(name = "comment")
public class Comment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String content;

  @ManyToOne
  @JoinColumn(name = "user_id")
  @JsonBackReference
  private User user;

  @ManyToOne
  @JoinColumn(name = "news_id")
  @JsonBackReference
  private News news;

  /*@ManyToMany(mappedBy = "comment")
  @Column(name = "comment_id")
  private List<ResponseComment> response_comment;*/

  private Timestamp createdAt;

  private Timestamp modifiedAt;

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

  /*public List<ResponseComment> getResponseComment() {
    return response_comment;
  }

  public void setResponseComment(List<ResponseComment> responseComment) {
    this.response_comment = responseComment;
  }*/

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

  /*public List<ResponseComment> getResponse_comment() {
	return response_comment;
  }

  public void setResponse_comment(List<ResponseComment> response_comment) {
	this.response_comment = response_comment;
  }*/

  public void setNews(News news) {
    this.news = news;
  }

  public News getNews() {
    return news;
  }


}
