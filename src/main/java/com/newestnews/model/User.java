package com.newestnews.model;

import javax.persistence.*;

import java.sql.Timestamp;
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
  
  @OneToMany(mappedBy="to")
  private List<Followers> followers;

  @OneToMany(mappedBy="from")
  private List<Followers> following;

  public List<Followers> getFollowers() {
	return followers;
  }
  
  private Timestamp createdAt;
  
  private Timestamp modifiedAt;

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
  

  public void setFollowers(List<Followers> followers) {
	this.followers = followers;
  }

  public List<Followers> getFollowing() {
	return following;
  }

  public void setFollowing(List<Followers> following) {
	this.following = following;
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
