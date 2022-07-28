package com.works.uygulama.restcontrollers;

import com.works.uygulama.repositories.FootTeamRepository;
import com.works.uygulama.utils.TEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamsCreateRestController {

    final FootTeamRepository tRepo;
    public TeamsCreateRestController(FootTeamRepository tRepo) {
        this.tRepo = tRepo;
    }

    @GetMapping("/teamCreate")
    public ResponseEntity teamCreate(@RequestParam TEnum t){
        return new ResponseEntity(tRepo.teamsAsil(t.ordinal()), HttpStatus.OK);
    }

    @GetMapping("/backUpCreate")
    public ResponseEntity backUpCreateCreate(@RequestParam TEnum t){
        return new ResponseEntity(tRepo.teamsYedek(t.ordinal()), HttpStatus.OK);
    }

}
