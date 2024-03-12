/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Employee {
    
    String name;
    String city;
    double Sal;
    double DA;
    double HRA;
    
    void getdata(String n,String c,double s,double D,double H){
        name = n;
        city =c;
        Sal=s;
        DA=D;
        HRA=H;
    }
    
    double cal(){
        double total = Sal+Sal*DA/100+Sal*HRA/100;
        return total;
    }
    
    void disp(){
        System.out.println("total salary is- ");
        System.out.println(cal());
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter name-");
        String name=sc.next();
        System.out.println("enter city-");
        String city=sc.next();
        System.out.println("enter salary-");
        double sal=sc.nextDouble();
        System.out.println("enter dearness allowance-");
        double DA=sc.nextDouble();
        System.out.println("enter house rent-");
        double HRA=sc.nextDouble();
        
        Employee ob=new Employee();
        
        ob.getdata(name, city, sal, DA, HRA);
        ob.disp();
        
        
        
        
    }
    
    
}
