package com.kch.exam.article;

import com.kch.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private static List<ArticleDto> datum;
    private static long lastId;

    static {
        datum = new ArrayList<>();
        lastId = 0;
    }

    public long write(String title, String body) {
        long id = ++lastId;
        ArticleDto newArticleDto = new ArticleDto(id, title, body);

        datum.add(newArticleDto);

        return id;
    }

    public List<ArticleDto> findAll() {

        return datum;
    }

    public ArticleDto findById(long id) {
        return datum.get((int)id - 1);
    }
}