package com.gmontinny.service;

import com.gmontinny.mappings.Article;
import com.gmontinny.mappings.ArticleQuery;

import java.io.IOException;
import java.util.List;

public interface ElasticsearchClientService {

    List<Article> fetchArticlesWithMustQuery(ArticleQuery articleQuery) throws IOException;

    List<Article> fetchArticlesWithShouldQuery(ArticleQuery articleQuery) throws IOException;

    List<Article> textSearch(List<String> fields, String term, int size) throws IOException;
}
