import java.util.Scanner;

class PrimeArr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[100];

        System.out.println("enter size(row and column) of array- ");
        int n= sc.nextInt();
        System.out.println("enter the elements- ");

        for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
        

        System.out.println("the matrix is-");

        for(int j=0;j<n;j++){
                System.out.print(arr[j]+"  ");
            }
            System.out.println();

        System.out.println("prime numbers in the given array are- ");

        int flag;
        for(int i=0;i<n;i++)
        {
            flag=1;

            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(arr[i]+"  ");
            }
            
        }




    }
}