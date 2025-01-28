package kevat25.backend_vko2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeleafController {

    @GetMapping("/hello2")
    public String nameAndAge(@RequestParam String name, int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hello2";
    }
}
