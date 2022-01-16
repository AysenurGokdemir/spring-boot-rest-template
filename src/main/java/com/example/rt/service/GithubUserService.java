package com.example.rt.service;

import com.example.rt.model.GithubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class GithubUserService  {

    @Autowired
    private RestTemplate restTemplate;

    private static String GITHUB_API = "https://api.github.com/users";

    public GithubUser[] getUsers() {

        GithubUser[] result = restTemplate.getForEntity(GITHUB_API,GithubUser[].class).getBody();

        return result;
    }
}
