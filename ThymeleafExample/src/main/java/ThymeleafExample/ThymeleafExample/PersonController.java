package ThymeleafExample.ThymeleafExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Array;
import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
    String getIndex(Model model){
        model.addAttribute("title", "This is my home page");
        return "index";
    }

    @GetMapping("/person")
    String getPeople(Model model){
        model.addAttribute("person", Arrays.asList(
                new Person("Ryan", 23),
                new Person("Amy", 22)
        ));
        return "person";
    }

}
