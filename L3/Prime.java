import java.util.Scanner;

class Prime
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower limt");
        int n = sc.nextInt();
        System.out.println("enter upper limt");
        int m = sc.nextInt();
        int flag;

        System.out.println("prime numbers between limits are-");
        for(int i=n;i<=m;i++)
        {
            flag=1;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(i);
            }
        }

        
    }
}