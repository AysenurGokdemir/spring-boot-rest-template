package com.example.rt.controller;

import com.example.rt.model.GithubUser;
import com.example.rt.service.GithubUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubUserController {

    @Autowired
    private GithubUserService githubApiUserService;

    @GetMapping("/")
    ResponseEntity<GithubUser[]> getAllUsers(){

        GithubUser[] users = githubApiUserService.getUsers();

        return new ResponseEntity<>(users,HttpStatus.OK);
    }


}
