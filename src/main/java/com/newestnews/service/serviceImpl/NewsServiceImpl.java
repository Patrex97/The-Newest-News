package com.newestnews.service.serviceImpl;

import com.newestnews.model.News;
import com.newestnews.repository.NewsRepository;
import com.newestnews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

  private NewsRepository newsRepository;

  @Autowired
  public NewsServiceImpl(NewsRepository newsRepository) {
    this.newsRepository = newsRepository;
  }

  @Override
  public News addNewNews(News news) {
    return newsRepository.save(news);
  }

  @Override
  public Optional<News> getNews(Long id) {
    return newsRepository.findById(id);
  }

  @Override
  public List<News> getAllNews() {
    return newsRepository.findAll();
  }
}
