package com.gratitude.agradecimientos.web.controller;

import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.domain.service.ThanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/thanks")
public class ThanksController {
    @Autowired
    private ThanksService thanksService;

    @GetMapping("/all")
    public ResponseEntity<List<Thanks>> getAll(){
        return new ResponseEntity<>(thanksService.getAll(), HttpStatus.OK);
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
