package chatgpt_task;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id ;
    String name ;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display(){
        System.out.println("the name is : "+ name );
        System.out.println("the id is : "+ id );
        System.out.println("and got marks : "+ marks );
        System.out.println();
        System.out.println("-------------------------------");
    }
}
public class Chatgpt_task2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1 , "yusuf", 98));
        list.add(new Student(2 , "hasan", 80));
        list.add(new Student(3 , "rehan", 75));

        for (Student s: list){
           s.display();
        }
        System.out.println("enter the search id: ");
        int sid = sc.nextInt();
        for (Student s: list){
            if (s.id==sid){
                s.display();
            }
        }
    }
}
