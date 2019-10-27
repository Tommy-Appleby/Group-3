package com.example.schoolapp;

import android.content.Context;

import android.content.SharedPreferences;

public class UserLocalStore
{
    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context)
    {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storedUserData(User user)
    {
        SharedPreferences.Editor spEdidor = userLocalDatabase.edit();
        spEdidor.putString("name", user.name);
        spEdidor.putInt("gradeLevel", user.gradeLevel);
        spEdidor.putString("username", user.username);
        spEdidor.putString("password", user.password);
        spEdidor.commit();
    }

    public User getLoggedInUser()
    {
    String name = userLocalDatabase.getString("name", "");
    int gradeLevel = userLocalDatabase.getInt("gradeLevel",-1);
    String username = userLocalDatabase.getString("username", "");
    String password = userLocalDatabase.getString("password", "");

    User storeUser = new User(name, gradeLevel , username, password);
    return storeUser;
    }
    public void setUserLoggedIn(boolean loggedIn)
    {
    SharedPreferences.Editor spEditor = userLocalDatabase.edit();
    spEditor.putBoolean("loggedIn", loggedIn);
    spEditor.commit();
    }
    public void clearUserData()
    {
        SharedPreferences.Editor spEdidor = userLocalDatabase.edit();
        spEdidor.clear();
        spEdidor.commit();

    }
}
