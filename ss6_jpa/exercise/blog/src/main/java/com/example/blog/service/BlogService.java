package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    void create(Blog blog);

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);

    List<Blog> search(String title);
}
