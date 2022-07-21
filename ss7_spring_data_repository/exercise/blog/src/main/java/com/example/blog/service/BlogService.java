package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    void create(Blog blog);

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);

    Page<Blog> search(String title, Pageable pageable);

    Page<Blog> findAllBlog(Pageable pageable);
}
