package com.example;

import com.example.entity.Student;
import com.example.model.StudentList;

import java.util.*;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static StudentList list;

    public static void menu(){
        System.out.printf("1.Add a new student to the list\n");
        System.out.printf("2.Delete a student from the list\n");
        System.out.println("3.Seach by name");
        System.out.printf("4.Seach by id\n");
        System.out.printf("5.print info order of mark\n");
        System.out.printf("6.exit\n");
    }

    public static void main(String[] args) {
        list = new StudentList();
        menu();
        while (true){
            int choise;
            System.out.printf("please have choise: ");
            choise= input.nextInt();
            if (choise == 1){
                addStudent();
                menu();
            }else if (choise==2){
                deleteStudent();
                menu();
            }else if (choise == 3){
                searchByName();
                menu();
            }else if (choise == 4){
                searchById();
                menu();
            }else if (choise == 6){
                System.exit(0);
            }
        }
    }

    private static void addStudent() {
        int id = 0;
        String fn;
        String ln;
        double mark;
        System.out.printf("Enter Student Id : ");
        id = input.nextInt();
        System.out.printf("Enter First name: ");
        fn = input.next();
        System.out.printf("Enter last name: ");
        ln = input.next();
        System.out.printf("Enter mark: ");
        mark = input.nextDouble();
        Student s =  new Student(id,fn,ln,mark);
        list.add(s);
    }
   public static void deleteStudent(){
        int id;
       System.out.printf("Enter student id: ");
       id = input.nextInt();
       list.remove(id);
   }
   public static void searchByName(){
        String name;
       System.out.printf("Enter a name: ");
       name = input.next();
       ArrayList<Student> found = list.findByName(name);
       list.showList(found);
   }
   public static void searchById(){
        int id;
       System.out.printf("Enter Id: ");
       id =input.nextInt();
       Student s = list.findById(id);
       if (s==null){
           System.out.printf("not found");
       } else {
           s.printInfo();
       }
   }
    public static void printSorted(){
        list.sortByMark();
        list.showList();
    }
}

