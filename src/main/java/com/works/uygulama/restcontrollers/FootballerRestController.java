package com.works.uygulama.restcontrollers;

import com.works.uygulama.entities.Footballer;
import com.works.uygulama.services.FootballerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/footballer")
public class FootballerRestController {

    final FootballerService fService;
    public FootballerRestController(FootballerService fService) {
        this.fService = fService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@Valid @RequestBody Footballer footballer) {
        return fService.save(footballer);
    }

    @PostMapping("/allSave")
    public ResponseEntity allSave(@Valid @RequestBody List<Footballer> footballers) {
        return fService.allSave(footballers);
    }

}
