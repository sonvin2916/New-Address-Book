package com.User;

import java.util.Scanner;

public class UserDetails {
    String firstname;
    String lastname;
    String address;
    String city;
    String zip;
    String phnum;
    Scanner sc=new Scanner(System.in);
    public void addUserInput() {
        System.out.println("Enter first name");
        String firstname=sc.next();
        System.out.println("Enter second name");
        String lastname=sc.next();
        System.out.println("Enter  address");
        String address=sc.next();
        System.out.println("Ente  city name");
        String city=sc.next();
        System.out.println("Enter state name");
        String state=sc.next();
        System.out.println("Enter  postal code");
        String zip=sc.next();
        System.out.println("Enter  phone number");
        String phnum=sc.next();
        UserObjects userobjects=new UserObjects(firstname,lastname,address,city,state,zip,phnum);
    }
}
