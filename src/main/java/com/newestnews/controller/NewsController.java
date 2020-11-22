package com.newestnews.controller;

import com.newestnews.model.News;
import com.newestnews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public @ResponseBody
    ResponseEntity<News> addNews(@RequestBody News news) {
        return ResponseEntity.ok(newsService.addNewNews(news));
    }

    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<Optional<News>> getNewsById(@PathVariable Long id) {
        return ResponseEntity.ok(newsService.getNews(id));
    }
}
