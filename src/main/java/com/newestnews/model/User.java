package com.newestnews.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements UserDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String username;

  private String password;

  private boolean isEnabled;

  @OneToMany(mappedBy = "user")
  private List<Comment> comment;

  @OneToMany(mappedBy = "user")
  private List<FavoriteNews> favorite_news;

  @OneToMany(mappedBy = "to")
  private List<Followers> followers;

  @OneToMany(mappedBy = "from")
  private List<Followers> following;

  public List<Followers> getFollowers() {
    return followers;
  }

  private Timestamp createdAt;

  private Timestamp modifiedAt;

  public User() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Collections.singleton(new SimpleGrantedAuthority("ROLE_PUBLISHER"));
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
