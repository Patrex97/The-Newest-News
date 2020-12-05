package com.newestnews.dto;

public class NewsDto {

  private long id;

  private String title;

  private String content;

  private String category;

  public NewsDto(long id, String title, String content, String category) {
    this.id = id;
    this.title = title;
    this.content = content;
    this.category = category;
  }

  @Override
  public String toString() {
    return this.title + " " + this.category;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getCategory() {
    return category;
  }

}
