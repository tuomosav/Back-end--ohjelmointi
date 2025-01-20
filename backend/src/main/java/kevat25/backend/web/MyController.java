package kevat25.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/main")
    @ResponseBody
    public String returnMessage() {
        return "Eka SB sovellukseni";
    }

    @RequestMapping("sayHelloAndAge")
    @ResponseBody
    public String returnGreeting(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String etunimi, @RequestParam int age) {
        return "Hei " + etunimi + ", " + age + " vuotta";
    }
    
}
