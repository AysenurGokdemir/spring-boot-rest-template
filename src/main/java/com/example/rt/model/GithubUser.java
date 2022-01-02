package com.example.rt.model;

public class GithubUser {

    private long id;
    private String name;
    private String login;
    private String avatar_url;
    private String repos_url;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getRepos_url() {
        return repos_url;
    }
}
