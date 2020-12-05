package com.newestnews.controller;

import com.newestnews.dto.NewsDto;
import com.newestnews.model.Category;
import com.newestnews.model.News;
import com.newestnews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    Optional<News> news = newsService.getNews(id);

    if(!news.isPresent()) {
      return ResponseEntity.ok(getAllNewsWithCategory(0, "empty1", "empty2", "empty3"));
    }

    long xid = news.get().getId();
    String title = news.get().getTitle();
    String content = news.get().getContent();
    Category category = news.get().getCategory();

    return ResponseEntity.ok(new NewsDto(xid, title, content, category.geName()));
  }

  private NewsDto getAllNewsWithCategory(int i, String string, String string2, String string3) {
    return null;
  }

  @GetMapping("/all")
  public @ResponseBody ResponseEntity<List<NewsDto>> getAllNews() {

    List<NewsDto> dtoResponse = new ArrayList<>();

    List<News> allNews = newsService.getAllNews();

    for (News news : allNews) {

      long id = news.getId();
      String title = news.getTitle();
      String content = news.getContent();
      Category category = news.getCategory();

      NewsDto ob1 = new NewsDto(id, title, content, category.geName());

      dtoResponse.add(ob1);
    }

    return ResponseEntity.ok(dtoResponse);
  }

}
