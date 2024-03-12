import java.util.Scanner;

interface Market{
    final Scanner scan= new Scanner(System.in);
    void sales();
}

class Hardware implements Market{
    String category;
    String manufacturer;
    Hardware(){
        System.out.print("Enter the category:");
        category=scan.next();
        System.out.print("Enter the manufacturer:");
        manufacturer=scan.next();
    }
    public void sales(){
        System.out.println("Total hardware units sold:200");
    }
    
}

class Software implements Market{
    String Type;
    String OS;
    Software(){
        System.out.print("Enter the type:");
        Type=scan.next();
        System.out.print("Enter the operating system:");
        OS=scan.next();
    }
    public void sales(){
        System.out.println("Total software units sold:300");
    }
}

public class First{
    public static void main(String args[]){
        Market m= new Hardware();
        m.sales();
        m=new Software();
        m.sales();
    }
}