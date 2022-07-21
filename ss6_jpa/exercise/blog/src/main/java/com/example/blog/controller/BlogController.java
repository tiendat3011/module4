package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping
    public String showListProduct(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(Blog blog) {
        blogService.create(blog);
        return "redirect:/";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        blogService.delete(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/";
    }
    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        blogService.update(blog);
        return "redirect:/index";
    }

    @GetMapping("/search")
    public String search(@RequestParam("title") String title, Model model) {
        model.addAttribute("blogList", blogService.search(title));
        return "index";
    }

    @GetMapping("/{id}/detail")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }
}
