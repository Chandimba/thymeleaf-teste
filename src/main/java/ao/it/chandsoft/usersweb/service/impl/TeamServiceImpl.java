package ao.it.chandsoft.usersweb.service.impl;

import ao.it.chandsoft.usersweb.domain.Team;
import ao.it.chandsoft.usersweb.domain.dto.Page;
import ao.it.chandsoft.usersweb.repository.TeamRepository;
import ao.it.chandsoft.usersweb.service.TeamService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Getter
@Setter
@AllArgsConstructor
@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Page<Team> findAllTeams(Pageable pageable) {

        org.springframework.data.domain.Page<Team> pageTeams = teamRepository.findAll(pageable);

        return new Page<Team>(pageTeams.getNumber(), pageTeams.getSize(), pageTeams.getContent());
    }
}
