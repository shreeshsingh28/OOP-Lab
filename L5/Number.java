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
public class Number {
    
    private double num;
    
    Number(double n){
        num=n;
    }
    boolean isZero(){
        if(num==0)
            return true;
        else
            return false;
    }
    boolean isPositive(){
        if(num>0)
            return true;
        else
            return false;
    }
    boolean isNegetive(){
        if(num<0)
            return true;
        else
            return false;
    }
    boolean isEven(){
        if(num%2==0)
            return true;
        else
            return false;
    }
    boolean isOdd(){
        if(num%2==0)
            return false;
        else
            return true;
    }
    boolean isPrime(){
        int flag=1;
        for(double i=2;i<num;i++)
        {
            if(num%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    boolean isArmstrong(){
        
        int n=(int)num;
        int sum=0;
        int dig=0;
        while(n>0)
        {
            dig=n%10;
            sum=sum+dig*dig*dig;
            n=n/10;
        }
        if(sum== (int)num)
            return true;
        else
            return false;
    }
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        double d=sc.nextDouble();
        Number n=new Number(d);
        
        if(n.isZero())
            System.out.println("zero");
        else
            System.out.println("not zero");
        
        if(n.isPositive())
            System.out.println("positive");
        else
            System.out.println("not positive");
        
        if(n.isNegetive())
            System.out.println("negetive");
        else
            System.out.println("not negetive");
        if(n.isEven())
            System.out.println("even");
        else
            System.out.println("not even");
        if(n.isOdd())
            System.out.println("odd");
        else
            System.out.println("not odd");
        if(n.isPrime())
            System.out.println("prime");
        else
            System.out.println("not prime");
        if(n.isArmstrong())
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
    
    
}
