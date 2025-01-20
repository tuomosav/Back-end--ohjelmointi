package kevat25.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControllerVko1 {
    @RequestMapping("/index")
    @ResponseBody
    public String returnMessage() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String returnMessage2() {
        return "This is the contact page";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String returnGreeting(@RequestParam (name="location") String lokaatio, @RequestParam (name="name") String etunimi) {
        return "Welcome to the " + lokaatio + " " + etunimi + "!";
    }
}
