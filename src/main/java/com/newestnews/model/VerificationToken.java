package com.newestnews.model;

import javax.persistence.*;

@Entity
public class VerificationToken {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String value;

  @OneToOne private User user;

  public VerificationToken(User user, String value) {
    this.user = user;
    this.value = value;
  }

  public VerificationToken() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
