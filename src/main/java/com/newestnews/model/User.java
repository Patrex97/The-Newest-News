package com.newestnews.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "logged_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "firstname")
  private String firstname;

  @Column(name = "lastname")
  private String lastname;

  @OneToMany(mappedBy = "user")
  private List<Comment> comment;

  @OneToMany(mappedBy = "user")
  private List<FavoriteNews> favorite_news;

  public User() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public List<Comment> getComment() {
    return comment;
  }

  public void setComment(List<Comment> comment) {
    this.comment = comment;
  }

  public List<FavoriteNews> getFavorite_news() {
    return favorite_news;
  }

  public void setFavorite_news(List<FavoriteNews> favorite_news) {
    this.favorite_news = favorite_news;
  }
}
