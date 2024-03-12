import java.util.Scanner;

class LarSmall{
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


        int lar=arr[0];
        int small=arr[0];

        for(int i=1;i<n;i++)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
            }
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        
        System.out.println("smallest element- "+small);
        System.out.println("largest element- "+lar);
}
}