import java.util.Scanner;

class Account{
    Scanner sc = new Scanner(System.in);
    String cname;
    int accno;
    String type;
    Double balance=0.0;
    static int a = 2022123;

    Account(){
        System.out.println("enter customer name- ");
        cname = sc.nextLine();
        accno = a;
        a++;
        System.out.println("allotted account number is- "+accno);
    }
}

class Savings extends Account{
    double interest = 1.5;

    Savings(){
        super();
        type = "Savings";
        System.out.println("enter deposit amount- ");
        double d = sc.nextDouble();
        balance += d;
        System.out.println("balance- "+balance);
    }

    void display(){
        System.out.println("customer details- ");
        System.out.println("customer name- "+cname);
        System.out.println("acc no- "+accno);
        System.out.println("account type- "+type);
        System.out.println("interest rate- "+interest+"%");
        System.out.println("balance- "+balance);
    }

    void computeIntrest(){
        balance += interest*balance;
    }

    void withdraw(){
        System.out.println("enter withdrawal amount- ");
        double d = sc.nextDouble();
        balance -= d;
    }
}
class Current extends Account{
    Current(){
        super();
        type = "Current";
        System.out.println("enter deposit amount (min balance is 5,000)- ");
        double d = sc.nextDouble();
        balance += d;
        System.out.println("balance- "+balance);

        if (balance < 10000) {
            balance -= balance*0.5;
            System.out.println("low balance !");
            
        }
    }

    void withdraw(){
        System.out.println("enter withdrawal amount- ");
        double d = sc.nextDouble();
        balance -= d;
        if (balance < 10000) {
            balance -= balance*1.5;
            System.out.println("low balance !");
        }
    }

    void display(){
        System.out.println("customer details- ");
        System.out.println("customer name- "+cname);
        System.out.println("acc no- "+accno);
        System.out.println("account type- "+type);
        System.out.println("balance- "+balance);
    }

}

public class One {
    public static void main(String args[]){
        Savings s1 = new Savings();
        s1.withdraw();
        s1.computeIntrest();
        s1.display();

        Current c1 = new Current();
        c1.withdraw();
        c1.display();
    }
    
}
