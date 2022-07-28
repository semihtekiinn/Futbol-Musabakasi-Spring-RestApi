package com.works.uygulama.restcontrollers;

import com.works.uygulama.entities.Team;
import com.works.uygulama.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/team")
public class TeamRestController {

    final TeamService tService;
    public TeamRestController(TeamService tService) {
        this.tService = tService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@Valid @RequestBody Team team) {
        return tService.save(team);
    }

}
