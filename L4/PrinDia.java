import java.util.Scanner;

class PrinDia{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]= new int[100][100];

        System.out.println("enter size(row and column) of array- ");
        int n= sc.nextInt();
        System.out.println("enter the elements- ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("the matrix is-");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i][i];
            }

        System.out.println("sum of principal diagonal elements is- "+sum);



    }
}