
import java.util.Scanner;
public class Time {
    
    int hour,min,sec;
    
    Time(){
        hour=0;
        min=0;
        sec=0;
    }
    Time(int h,int m,int s){
        hour=h;
        min=m;
        sec=s;
    }
    
    void disp(){
        System.out.println("time is- "+hour+":"+min+":"+sec);
    }
    
    void add(Time o1,Time o2){
        
        hour = o1.hour + o2.hour;
        min = o1.min + o2.min;
        sec = o1.sec + o2.sec;

        int m = 0;
        while (sec >= 60)
        {
            sec = sec - 60;
            m++;
        }
        min = min + m;

        int h = 0;
        while (min >= 60)
        {
            min = min - 60;
            h++;
        }
        hour = hour + h;

        while (hour > 24)
        {
            hour = hour - 24;
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter hour- ");
        int h1=sc.nextInt();
        System.out.println("enter min- ");
        int m1=sc.nextInt();
        System.out.println("enter sec- ");
        int s1=sc.nextInt();
        Time ob1=new Time(h1,m1,s1);
        ob1.disp();
        
        System.out.println("enter hour- ");
        int h2=sc.nextInt();
        System.out.println("enter min- ");
        int m2=sc.nextInt();
        System.out.println("enter sec- ");
        int s2=sc.nextInt();
        Time ob2=new Time(h2,m2,s2);
        ob2.disp();
        
        Time ob3 = new Time();
        ob3.add(ob1, ob2);
        
        System.out.print("added ");
        ob3.disp();
        
        
        
    }
    
    
    
}
