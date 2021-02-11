package ThymeleafExample.ThymeleafExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(){
        return "index";
    }
}
