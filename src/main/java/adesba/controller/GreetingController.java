package adesba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;

@Controller
public class GreetingController {

    @RequestMapping(value = {"/"})
    public String viewHomePage(Model model) {
        model.addAttribute("fecha", LocalDate.now());
        return "gt";
    }

    @RequestMapping(value = ("/bum"))
    public String bum(Model model){
        model.addAttribute("bum","jojojojojo");
        return "index";
    }

}
