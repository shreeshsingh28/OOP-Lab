import java.util.Scanner;

class Eval{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int arr[]=new int[100];

        System.out.println("enter the number of elemnts in the array- ");
        int n=sc.nextInt();

        System.out.println("enter the elements-");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("the array is- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        int cnt;
        for(int i=0;i<n;i++)
        {
            cnt=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                }
            }

            System.out.println("frequency of "+arr[i]+" is "+cnt);

        }



    }
}