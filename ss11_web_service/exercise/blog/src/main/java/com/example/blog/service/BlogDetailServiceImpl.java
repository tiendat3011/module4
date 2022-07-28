package com.example.blog.service;

import com.example.blog.model.BlogDetail;
import com.example.blog.repository.BlogDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogDetailServiceImpl implements BlogDetailService{


    @Autowired
    private BlogDetailRepository blogDetailRepository;

    @Override
    public void createDetail(String content) {
        blogDetailRepository.create(content);
    }


    @Override
    public List<BlogDetail> findAllBlogDetail() {
        return blogDetailRepository.findAllBlogDetail();
    }
}
