package medical.controller;

import medical.model.Medical;
import medical.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalController {
    @Autowired
    private MedicalService medicalService;

    @GetMapping("/")
    private String showList(Model model) {
        model.addAttribute("medical", new Medical());
        model.addAttribute("years", medicalService.years());
        model.addAttribute("vehicles", medicalService.vehicles());
        return "show";
    }

    @PostMapping("/show")
    private String addMedical(@ModelAttribute("medical") Medical medical, Model model) {
        model.addAttribute("medical", medical);
        return "list";
    }
}
