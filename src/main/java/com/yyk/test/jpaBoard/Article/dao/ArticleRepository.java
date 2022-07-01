package com.yyk.test.jpaBoard.Article.dao;

import com.yyk.test.jpaBoard.Article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
