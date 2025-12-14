package com.mycompany.library;
public class CommonUser extends User {
    
    public CommonUser(String name){
    super(name);
    }
    public CommonUser(String name , String email ,String phonenumber){
    super(name,email,phonenumber);
    }
    
    @Override
    public void menu (){
        System.out.println("1.View books");
        System.out.println("2.Search");
        System.out.println("3.Place orders");
        System.out.println("4.Borrow books");
        System.out.println("5.Calculate fine");
        System.out.println("6.Return books");
        System.out.println("7.Exist console ");
    }
    
}
