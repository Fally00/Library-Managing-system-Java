package com.mycompany.library;

public class Admin extends User {
    
    public Admin (String name){
    super(name);
    }
    public Admin(String name , String email ,String phonenumber){
    super(name,email,phonenumber);
    }
    
    @Override
    public void menu (){
        System.out.println("1.View books");
        System.out.println("2.Add books");
        System.out.println("3.Delete books");
        System.out.println("4.Search");
        System.out.println("5.Delete all pre-existed data");
        System.out.println("6.View orders");
        System.out.println("7.Exist console");
    }
    
}
