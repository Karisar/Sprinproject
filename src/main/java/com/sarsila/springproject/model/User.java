package com.sarsila.springproject.model;

public class User {
 
    private String userName;
    private String firstName;
    
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setFirstName (String name)
    {
    	this.firstName=name;
    }
}