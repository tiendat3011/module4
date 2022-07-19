package com.example.controller;

import com.example.model.Music;
import com.example.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    private MusicService musicService;

    @GetMapping
    public String showListMusic(Model model) {
        model.addAttribute("musicList", musicService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/create")
    public String create(Music music) {
        musicService.create(music);
        return "redirect:/index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        musicService.delete(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/index";
    }

    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("music", musicService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(Music music) {
        musicService.update(music);
        return "redirect:/index";
    }

    @GetMapping("/search")
    public String search(String nameMusic, Model model) {
        model.addAttribute("productList", musicService.search(nameMusic));
        return "index";
    }

    @GetMapping("/{id}/detail")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("music", musicService.findById(id));
        return "detail";
    }
}
