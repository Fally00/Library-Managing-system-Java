package com.mycompany.library;
import java.util.Scanner;
public class Library {


    static Scanner s;
    static database data;
    
    public static void main(String[] args) {
        
        data = new database(); 
        System.out.println("Welcome to The Library");
       int num;
       do{
        System.out.println("0.Exit\n1. Login\n2. New User");
        s =new Scanner(System.in);
        num = s.nextInt();
        
        switch (num){
            case 1 : 
                login();
                break;
            case 2 : 
                newuser();
                break;
            }
        } while (num != 0);
    }
    private static void login(){
        System.out.println("Enter Phone number ");
        String phonenumber = s.next();
        System.out.println("Enter Email");
        String email = s.next();
        int n = data.login(phonenumber,email);
        if (n != -1){
            User user = data.getUser(n);
            user.menu();
        }
        else{
            System.out.println("User doesn't exist (probably dead ^_^)! ");
        }
    }
    
    private static void newuser(){
        System.out.println("Enter Name");
        String name =s.next();
        System.out.println("Enter Phone number ");
        String phonenumber = s.next();
        System.out.println("Enter Email");
        String email = s.next();
        System.out.println("1.Admin // 2.Commen user");
        
        int n2 =s.nextInt();
        
        User user;
        if (n2==1){
            user = new Admin(name,email,phonenumber);
        }else{
            user = new CommonUser(name,email,phonenumber); 
        }
        data.AddUser(user);
        user.menu();
        
    }
}
