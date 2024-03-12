class Bank{
    double interest = 10;

    void getRate(){
        System.out.println("rate- "+interest);
    }

}

class SBI extends Bank{
    SBI(){
        interest = 8;
    }

    void getRate(){
        System.out.println("rate- "+interest);
    }
}

class ICICI extends Bank{
    ICICI(){
        interest = 7;
    }
    void getRate(){
        System.out.println("rate- "+interest);
    }

}

class AXIS extends Bank{
    AXIS(){
        interest = 6;
    }
    void getRate(){
        System.out.println("rate- "+interest);
    }
}

class Third{
    public static void main(String args[]){
        Bank b = new Bank();
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        b.getRate();
        b=s;
        b.getRate();
        b=i;
        b.getRate();
        b=a;
        b.getRate();
    }
}