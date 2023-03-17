package com.example.model;


import com.example.entity.Student;

import java.util.*;

public class StudentList {
    private ArrayList<Student> list;
    private int length;

    public StudentList(){
        list = new ArrayList<Student>();}
    public ArrayList<Student> findByName(String name) {
        boolean found = false;
        ArrayList<Student> matches = new ArrayList<>();
        for (Student s : list) {
            String fullname = new String(s.getFirstName() + "" + s.getLastName()).toLowerCase(Locale.ROOT);
            if (fullname.matches("(.*)" + name.toLowerCase() + "(.*)")) {
                matches.add(s);
                found = true;
            }
        }
        if (found == false) {
            System.out.printf("Not found");
        }
        return matches;
    }
    public Student findById(int id){
    for (Student s:list){
        if (s.getId() == id){
        return s;
    }
    }
    return null;
    }
    public void add(Student s){ list.add(s);}

    public void remove(int id){
        boolean found = false;
        for(Student s:list){
            if (s.getId() == id) {
                int choise;
                System.out.printf("Are ou sure deleting this student ?\n (1.Yes 2.No)");
                choise = new Scanner(System.in).nextInt();
                if (choise == 1) list.remove(s);
                found = true;
            }
        }
        if (found == false){
            System.out.printf("Can not find student with us" + id);
        }
    }
    public void sortByMark(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return new Double(s2.getMark()).compareTo(s1.getMark());}
        });
    }
    public void showList(){
        for(Student s: list){
            s.printInfo();
        }
    }
    public  void showList(ArrayList<Student> slist){
        for (Student s:list){
            s.printInfo();
        }
    }
}

