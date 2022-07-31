package com.example.blog.service;

import com.example.blog.model.BlogDetail;

import java.util.List;

public interface BlogDetailService {
    List<BlogDetail> findAllBlogDetail();

    void createDetail(String content);
}
