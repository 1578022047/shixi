package com.example.shixi.service;

import com.example.shixi.bean.People;
import com.example.shixi.dao.PeopleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeopleService {
    @Autowired(required = false)
    private PeopleDao peopleDao;

    public List<People> getAllPeople(){
        return peopleDao.findAllPeople();
    }
}
