package com.example.shixi.controller;

import com.example.shixi.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
    @Autowired(required = false)
    private PeopleService peopleService;

    @RequestMapping(value = "/getAllPeople")
    public String getAllPeople(){
        return peopleService.getAllPeople().toString();
    }

}
