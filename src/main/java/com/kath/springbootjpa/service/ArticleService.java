package com.kath.springbootjpa.service;

import com.kath.springbootjpa.domain.Article;
import com.kath.springbootjpa.domain.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Article saveArticle(Article article){
        return articleRepository.save(article);
    }

    public Article updateArticle(Article article){
        return articleRepository.save(article);
    }

    public Article findArticle(Long id){

        return articleRepository.getOne(id);
    }

    public void deleteArticle(Long id){
        articleRepository.deleteById(id);
    }
}
