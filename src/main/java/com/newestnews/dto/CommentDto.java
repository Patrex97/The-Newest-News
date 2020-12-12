package com.newestnews.dto;

public class CommentDto {

    private long id;

    private String content;

    private long newsId;

    private long userId;

    public CommentDto(long id, String content, long userId, long newsId) {
        this.id = id;
        this.content = content;
        this.newsId = newsId;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }



}
