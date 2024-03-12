import java.util.Scanner;

class Sine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of x in sin(x)");
        double n=sc.nextDouble();
        double sin=0;

        for ( double i = 0; i < 100; i++) {
            
            double x=2*i+1;
            
            double fact=1;
            for(double j=1;j<=x;j++)
            {
                fact=fact*j;
            }

            double a=Math.pow(-1, i);
            double b= Math.pow(n, x);
             sin=sin+(a*b/fact);
        }
        System.out.println(sin);

    }
}
