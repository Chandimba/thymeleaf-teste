package ao.it.chandsoft.usersweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String findUsers() {
        return "index";
    }


}
