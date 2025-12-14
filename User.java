package com.mycompany.library;

public class User {
    protected String name;
    protected String email;
    protected String phonenumber;

    public User() {
    }

    // Constructor with name
    public User(String name) {
        this.name = name;
    }

    // Constructor with name, email, and phone number
    public User(String name, String email, String phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    /**
    * Displays the main menu for the library system.
    */
    abstract void menu();
}