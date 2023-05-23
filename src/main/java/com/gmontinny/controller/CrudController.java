package com.gmontinny.controller;

import com.gmontinny.mappings.Article;
import com.gmontinny.repository.springdata.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/articles")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CrudController {

    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping(value = "/", consumes = "application/json")
    public Article create(@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Article retrieve(@PathVariable String id) {
        return articleRepository.findById(id).orElseThrow(() -> new NoSuchElementException("ID: " + id));
    }

    @PutMapping(value = "/", consumes = "application/json")
    public Article update(@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable String id) {
        articleRepository.deleteById(id);
        return "Done";
    }
}
