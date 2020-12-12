package com.newestnews.controller;

import com.newestnews.dto.CommentDto;
import com.newestnews.dto.NewsDto;
import com.newestnews.model.Comment;
import com.newestnews.model.News;
import com.newestnews.service.NewsService;
import com.newestnews.service.serviceImpl.MapperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {

  private NewsService newsService;

  @Autowired
  public NewsController(NewsService newsService) {
    this.newsService = newsService;
  }

  @PostMapping("/add")
  public @ResponseBody ResponseEntity<News> addNews(@RequestBody News news) {
    return ResponseEntity.ok(newsService.addNewNews(news));
  }

  @GetMapping("/{id}")
  public @ResponseBody ResponseEntity<NewsDto> getNewsById(@PathVariable Long id) {
    return ResponseEntity.ok(MapperService.getNewsById(id, newsService));
  }

  @GetMapping("/all")
  public @ResponseBody ResponseEntity<List<NewsDto>> getAllNews() {
    return ResponseEntity.ok(MapperService.getAllNews(newsService));
  }

  @GetMapping("/{id}/comments")
  public @ResponseBody ResponseEntity<List<CommentDto>> getCommentsForNews(@PathVariable Long id) {
    return ResponseEntity.ok(MapperService.getCommentsForNews(id, newsService));
  }

}
