package com.newestnews.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.newestnews.dto.CommentDto;
import com.newestnews.dto.NewsDto;
import com.newestnews.model.Comment;
import com.newestnews.model.News;
import com.newestnews.service.NewsService;

public class MapperService {

    public static List<NewsDto> getAllNews(NewsService newsService) {

        List<NewsDto> dtoResponse = new ArrayList<>();

        List<News> allNews = newsService.getAllNews();

        for (News news : allNews) {

            dtoResponse.add(new NewsDto(
                                news.getId(),
                                news.getTitle(),
                                news.getContent(),
                                news.getCategory().geName()));
        }

        return dtoResponse;
    }

    public static NewsDto getNewsById(Long id, NewsService newsService) {
        Optional<News> news = newsService.getNews(id);

        if(!news.isPresent()) { return null; }

        return new NewsDto(
            news.get().getId(),
            news.get().getTitle(),
            news.get().getContent(),
            news.get().getCategory().geName());
    }


    public static List<CommentDto> getCommentsForNews(Long id, NewsService newsService) {
        Optional<News> news = newsService.getNews(id);

        List<CommentDto> dtoResponse = new ArrayList<>();

        if(!news.isPresent()) { return null; }

        List<Comment> allComms =  news.get().getComment();
        System.out.println(allComms);

        for (Comment comm : allComms) {

            dtoResponse.add(new CommentDto(
                                comm.getId(),
                                comm.getContent(),
                                comm.getUser().getId(),
                                comm.getNews().getId()));
        }

        return dtoResponse;

    }

}
