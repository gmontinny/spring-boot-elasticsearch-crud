package com.gmontinny.service;

import com.gmontinny.mappings.Article;
import org.springframework.data.elasticsearch.core.query.UpdateResponse;

public interface ElasticsearchOperationsService {
    Article create(Article article);

    Article retrieve(String id);

    UpdateResponse update(Article article);

    String delete(String id);
}
