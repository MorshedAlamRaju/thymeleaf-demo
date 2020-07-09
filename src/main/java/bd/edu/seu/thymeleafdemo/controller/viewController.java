package bd.edu.seu.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class viewController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloForm(){
        return "helloForm";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(HttpServletRequest request, Model model){

        // Get name Parameter from request; will be null if no parameter is passed
        String name = request.getParameter("name");
        if(name == null || name == ""){
            name = "world";
        }

        model.addAttribute("message", "Hello, " + name + "!");
        return "index";
    }

}
