package com.example.schoolapp;

public class User
{
    String name, username, password;
    int gradeLevel;

    public User(String name, int gradeLevel, String username, String password)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password)
    {
        this.username= username;
        this.password= password;
        this.gradeLevel= -1;
        this.name="";

    }

}
