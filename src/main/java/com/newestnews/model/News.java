package com.newestnews.model;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "news")
public class News {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "content")
  private String content;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;
  
  private Timestamp createdAt;
  
  private Timestamp modifiedAt;

  public News() {}

  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
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
