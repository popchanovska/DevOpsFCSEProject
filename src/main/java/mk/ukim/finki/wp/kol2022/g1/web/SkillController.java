package mk.ukim.finki.wp.kol2022.g1.web;

import mk.ukim.finki.wp.kol2022.g1.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SkillController {
    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/skill")
    public String showList(Model model) {

        return "add-skill";
    }

    @PostMapping("/skill")
    public String create(@RequestParam String name) {
        this.skillService.create(name);
        return "redirect:/employees";
    }
}
