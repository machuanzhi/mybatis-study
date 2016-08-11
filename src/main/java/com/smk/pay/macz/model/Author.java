package com.smk.pay.macz.model;

/**
 * Project mybatis-study
 * Created by chuanzhi.mcz
 * Date 2016/8/11 9:45
 */
public class Author {

    private Integer id;

    private String username;

    private String password;

    private String email;

    private String bio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
