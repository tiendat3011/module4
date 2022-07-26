package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import com.example.blog.service.CategoryService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String showListProduct(@RequestParam(name = "page", defaultValue = "0") int page,
                                  @RequestParam(name = "title", defaultValue = "") String title,
                                  Model model) {
        Sort sort = Sort.by("date_write").ascending();
        Page<Blog> blogList = blogService.search(title, PageRequest.of(page, 1, sort));
        model.addAttribute("blog", new Blog());
        model.addAttribute("blogList", blogList);
        model.addAttribute("title", title);
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList", categoryService.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String create(Blog blog) {
        blogService.create(blog);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        blogService.delete(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/list";
    }

    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        blogService.update(blog);
        return "redirect:/list";
    }
    @GetMapping("/{id}/detail")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }
    @GetMapping
    public String showCategory (Model model){
        model.addAttribute("categoryList", categoryService.findAll());
        return "category";
    }
    @GetMapping("/searchCategory")
    public String searchCategory(@RequestParam(name = "page", defaultValue = "0")int page,
                                 @RequestParam(name = "title")String title, Model model){
        Page<Blog> blogList= blogService.findAllByCategory_Id(title,PageRequest.of(page,1,short));
        "blogList", blogService.search(title,PageRequest.of(page,1)))
        model.addAttribute("title", title);
        return "redirect:/list";
    }
}