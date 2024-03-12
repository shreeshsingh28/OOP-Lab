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
class Complex {
    
    int re;
    int im;
    
    Complex(int r,int i){
        re=r;
        im=i;
    }
    
    void add(int n,Complex c){
        System.out.println((n+c.re)+" + i"+c.im);
    }
    
    void add(Complex a,Complex b){
        System.out.println((a.re+b.re)+" + i"+(a.im+b.im));
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter integer- ");
        int m=sc.nextInt();
        
        System.out.println("enter real and imaginary parts- ");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        
        System.out.println("enter real and imaginary parts- ");
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        
        Complex c1 = new Complex(r1,i1);
        Complex c2 = new Complex(r2,i2);
        
        c1.add(m, c1);
        c1.add(c1, c2);
        
    
    }
    
    
    
}
