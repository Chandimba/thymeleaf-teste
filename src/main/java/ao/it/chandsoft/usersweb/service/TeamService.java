package ao.it.chandsoft.usersweb.service;

import ao.it.chandsoft.usersweb.domain.Team;
import ao.it.chandsoft.usersweb.domain.dto.Page;
import org.springframework.data.domain.Pageable;

public interface TeamService {

    Team saveTeam(Team team);
    Page<Team> findAllTeams(Pageable pageable);

}
