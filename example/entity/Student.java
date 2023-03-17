package com.example.entity;

import java.util.Scanner;
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double mark;

    public Student(){

    }
    public Student(int id,String fistName, String lastName,double mark){
        this.id = id;
        this.firstName = fistName;
        this.lastName = lastName;
        this.mark = mark;
    }
    public void scanInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter ID : ");
        this.id = scanner.nextInt();
        System.out.printf("Enter First name: ");
        this.firstName = scanner.next();
        System.out.printf("Enter last name:  ");
        this.lastName = scanner.next();
        System.out.printf("Enter mark: ");
        this.mark = scanner.nextDouble();
    }
    public  void printInfo(){
        System.out.printf("haha\n", getId(), getFirstName(),getLastName(),getMark());
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMark() {
        return mark;
    }
}
