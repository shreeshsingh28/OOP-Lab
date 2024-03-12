import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    static String college = "MIT";

    Student(){
        System.out.println("enter name- ");
        name = sc.next();
        System.out.println("enter id- ");
        id = sc.nextInt();
    }

    void display(){
        System.out.println("student details- ");
        System.out.println("name- "+name);
        System.out.println("id- "+id);
        System.out.println("college- "+college);
    }

    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.display();
        s2.display();
    }
}
