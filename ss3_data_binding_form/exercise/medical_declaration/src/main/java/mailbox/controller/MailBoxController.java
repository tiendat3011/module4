package mailbox.controller;

import mailbox.model.MailBox;
import mailbox.service.MailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailBoxController {
    @Autowired
    private MailBoxService mailBoxService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("mailBox", new MailBox());
        model.addAttribute("languages", mailBoxService.languages());
        model.addAttribute("listSize", mailBoxService.size());
        return "list";
    }

    @PostMapping("/show")
    public String addMail(@ModelAttribute("mailBox") MailBox mailBox, Model model) {
        model.addAttribute("mailBox", mailBox);
        return "show";
    }

}
