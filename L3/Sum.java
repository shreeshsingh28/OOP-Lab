import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of n-");
        double n=sc.nextDouble();

        double sum=0;
        double a,b;
        for (double i = 1; i <=n; i++) {

            a=1/i;
            b=Math.pow(a, i);
            sum=sum+b;
        }

        System.out.println("sum of series is- "+sum);

    }
}