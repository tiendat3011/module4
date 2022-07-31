package com.example.blog.service;

import com.example.blog.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    void create(String typeBlog);
}
