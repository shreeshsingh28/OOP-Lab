import java.util.Scanner;

class Student{
    Scanner sc = new Scanner(System.in);
    int regno;
    String name;
    int age;

    Student(){
        System.out.println("enter regno- ");
        regno = sc.nextInt();
        System.out.println("enter name- ");
        name = sc.next();
        System.out.println("enter age- ");
        age = sc.nextInt();
    }
}

class UG extends Student{
    int sem;
    int fee;

    UG(){
        super();
        System.out.println("enter sem- ");
        sem = sc.nextInt();
        System.out.println("enter fee- ");
        fee = sc.nextInt();
    }

    void display(){
        System.out.println("student details- ");
        System.out.println("reg no- "+regno);
        System.out.println("name- "+name);
        System.out.println("age- "+age);
        System.out.println("sem- "+sem);
        System.out.println("fees- "+fee);
    }

}

class PG extends Student{
    
    int sem;
    int fee;

    PG(){
        super();
        System.out.println("enter sem- ");
        sem = sc.nextInt();
        System.out.println("enter fee- ");
        fee = sc.nextInt();
    }

    void display(){
        System.out.println("student details- ");
        System.out.println("reg no- "+regno);
        System.out.println("name- "+name);
        System.out.println("age- "+age);
        System.out.println("sem- "+sem);
        System.out.println("fees- "+fee);
    }

}

public class Second {
    public static void main(String args[]){
        UG s1 = new UG();
        s1.display();

        PG s2 = new PG();
        s2.display();
    }
    
}
