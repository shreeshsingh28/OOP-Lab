import java.util.Scanner;
class Greatest
{
public static void main(String s[])
{
System.out.println("enter three numbers");
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
 int greatest = (a>b)?((a>c)?a:c):((b>c)?b:c);

System.out.println("greatest number is "+greatest);
}
}
