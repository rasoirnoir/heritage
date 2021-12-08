package fr.william.heritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.william.heritage.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
