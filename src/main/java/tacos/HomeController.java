package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/Register")
    public String register(){
        return "registerForm";
    }

    @RequestMapping("/ingredient")
    public ModelAndView ingredient(){
        List<String> ingredient = new ArrayList<>();
        System.out.println(" in Ingredient");
        ingredient.add("tomato");
        ingredient.add("rice");
        ingredient.add("flour");
        ingredient.add("ketachp");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(ingredient);
        return modelAndView;
    }
}
