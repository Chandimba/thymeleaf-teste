package ao.it.chandsoft.usersweb.controller;

import ao.it.chandsoft.usersweb.domain.User;
import ao.it.chandsoft.usersweb.domain.dto.Page;
import ao.it.chandsoft.usersweb.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@AllArgsConstructor
@Controller
@RequestMapping("users")
public class UserController {

    private UserService userService;

    @GetMapping("/find-all")
    public ModelAndView findUsers() {

        Page<User> userPage = userService.findAll(0, 1000);
        ModelAndView modelAndView = new ModelAndView("find-users");
        modelAndView.addObject("users", userPage.getContent());

        return modelAndView;
    }

}
