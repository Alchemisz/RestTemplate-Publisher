package com.example.publisher.controller;

import com.example.publisher.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @GetMapping
    public ResponseEntity<Person> getPerson(){
        Person person = new Person("Adrian", "Rubak");
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

}
