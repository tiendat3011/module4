package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void create(Blog blog) {
        blogRepository.create(blog.getTitle(),blog.getContent(),blog.getDateWrite(),blog.getCategory().getId());
    }

    @Override
    public void delete(int id) {
        blogRepository.delete(id);
    }

    @Override
    public Blog findById(int id) {

        return blogRepository.findById(id);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.update(blog.getTitle(),blog.getContent(),blog.getDateWrite(),blog.getId());
    }

    @Override
    public Page<Blog> search(String title, Pageable pageable) {
        return blogRepository.search("%"+"title"+"%", pageable);
    }

    @Override
    public Page<Blog> findAllBlog(Pageable pageable) {
        return blogRepository.findAllBlog(pageable);
    }

    @Override
    public Page<Blog> findAllByCategory_Id(Pageable pageable, Integer id) {
        return blogRepository.findAllByCategory_Id(pageable, id);
    }
}