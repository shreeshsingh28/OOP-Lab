import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
{
        int sum=0;
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int dig=0;
        int num=n;
        while(n>0){
            dig=n%10;
            sum=sum+dig*dig*dig;
            n=n/10;
        }
        if(sum==num){
            System.out.println("number is an armstrong number");
        }
        else
            System.out.println("number not an armstrong number");
    }
}