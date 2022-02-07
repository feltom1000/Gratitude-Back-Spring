package com.gratitude.agradecimientos.web.controller;

import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.domain.service.ThanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/thanks")
public class ThanksController {
    @Autowired
    private ThanksService thanksService;

    @GetMapping("/all")
    public ResponseEntity<List<Thanks>> getAll(){
        return new ResponseEntity<>(thanksService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Thanks>> getThanks(@PathVariable("id") int thanksId){
        if (thanksService.getThanks(thanksId).isPresent()){
            return new ResponseEntity<>(thanksService.getThanks(thanksId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
        public ResponseEntity<Thanks> save(@RequestBody Thanks thanks){
        return new ResponseEntity<>(thanksService.save(thanks), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
        public ResponseEntity delete(@PathVariable("id") int thanksId){
        if (thanksService.deleteById(thanksId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
