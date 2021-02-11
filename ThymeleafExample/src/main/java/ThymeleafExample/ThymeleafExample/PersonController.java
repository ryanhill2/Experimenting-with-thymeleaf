package ThymeleafExample.ThymeleafExample;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(){
        return "people";
    }
}
