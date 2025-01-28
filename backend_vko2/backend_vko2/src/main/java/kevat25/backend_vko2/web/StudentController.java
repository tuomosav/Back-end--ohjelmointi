package kevat25.backend_vko2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import kevat25.backend_vko2.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {

    public static List<Student> students = new ArrayList<Student>();

    static {
    students.add(new Student("Aku", "Ankka"));
    students.add(new Student("Hannu", "Hanhi"));
    students.add(new Student("Iines", "Ankka"));
    students.add(new Student("Hessu", "Hopo"));
    }

    @GetMapping("/hello")
    public String showStudents(Model model) {
        model.addAttribute("students", students);
        return "studentlist";
    }
    

}
