package com.newestnews.model;

import javax.persistence.*;
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

  @OneToMany(mappedBy = "news")
  private List<FavoriteNews> favorite_news;

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

  public List<FavoriteNews> getFavorite_news() {
    return favorite_news;
  }

  public void setFavorite_news(List<FavoriteNews> favorite_news) {
    this.favorite_news = favorite_news;
  }
}
