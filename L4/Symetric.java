import java.util.Scanner;

class Symetric{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]= new int[100][100];
        int trans[][]=new int[100][100];

        System.out.println("enter size(row and column) of array- ");
        int n= sc.nextInt();
        
        System.out.println("enter the elements for matrix- ");
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

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trans[i][j]=arr[j][i];
            }
        }

        System.out.println("the transpose matrix is-");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(trans[i][j]+"  ");
            }
            System.out.println();
        }

        int flag =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]!=trans[i][j]){
                    flag=0;
                    break;
                }
            }
        }

        if(flag==1)
        System.out.println("symmmetric");
        else
        System.out.println("not symmetric");

    

        


    

    }
}