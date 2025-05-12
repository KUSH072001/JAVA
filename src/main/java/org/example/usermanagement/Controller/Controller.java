package org.example.usermanagement.Controller;

import org.example.usermanagement.Repository.Repository;
import org.example.usermanagement.Service.Service;
import org.example.usermanagement.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private Repository Repo;
    @Autowired
    private Service service;



    @GetMapping("/get")
    public List<User> getData(){
       return Repo.findAll();
    }
    @PostMapping("/add")
    public String addUser(@RequestBody User adduser){
        Repo.save(adduser);
        return "success";
    }
    @PostMapping("/get/{id}")
    public Optional<User> getbyID(@PathVariable Long id){
        return Repo.findById(id);
    }

    @PostMapping("/CreateUser/{id}")
    public String login(@PathVariable Long id, @RequestBody User loginuser){
        for(User user:Repo.findAll()){
            if(user.getId().equals(id)){
                return "User Already Exists";
            }

        }
        Repo.save(loginuser);

        return "User Successfully Register";
    }



}
