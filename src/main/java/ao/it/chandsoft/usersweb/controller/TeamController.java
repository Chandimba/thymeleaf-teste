package ao.it.chandsoft.usersweb.controller;

import ao.it.chandsoft.usersweb.domain.Team;
import ao.it.chandsoft.usersweb.service.TeamService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@AllArgsConstructor
@Controller
@RequestMapping("teams")
public class TeamController {

    private TeamService teamService;

    @GetMapping("save-team")
    public String saveTeam(@ModelAttribute Team team, Model modelAndView) {

        modelAndView.addAttribute("team", team);

        return "save-team";
    }

    @PostMapping("save-team")
    public String saveTeam(@Valid @ModelAttribute Team team, BindingResult fields, Model modelAndView) {

        if(fields.hasErrors()) {
            modelAndView.addAttribute("team", team);
            modelAndView.addAttribute("fields", fields);
        } else {
            team = teamService.saveTeam(team);
            modelAndView.addAttribute("team", new Team());
            modelAndView.addAttribute("msgSuccess", "Team successful saved with id = " + team.getId());
        }


        return "save-team";
    }
}
