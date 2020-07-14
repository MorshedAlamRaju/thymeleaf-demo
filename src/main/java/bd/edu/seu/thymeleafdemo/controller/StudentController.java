package bd.edu.seu.thymeleafdemo.controller;

import bd.edu.seu.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import static java.lang.Long.parseLong;

@Controller
public class StudentController {
    @RequestMapping(value = "/student")
    public String findById(HttpServletRequest request, Model model){
        long id = parseLong(request.getParameter("id"));
        Student student = new Student(id, "Chandler", "M");
        model.addAttribute("student", student);
        return "student";
    }

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Student student, BindingResult errors, Model model) {
        System.out.println(student);
        return "student";
    }

}
