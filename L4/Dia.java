import java.util.Scanner;

class Dia{
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
        int i=0;
            for(int j=n-1;j>=0;j--){
                sum=sum+arr[i++][j];
            }

        System.out.println("sum of non principal diagonal is- "+sum);



    }
}