package com.newestnews.service;

import com.newestnews.model.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {

  News addNewNews(News news);

  Optional<News> getNews(Long id);

  List<News> getAllNews();
}
