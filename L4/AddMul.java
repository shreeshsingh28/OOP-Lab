import java.util.Scanner;

class AddMul{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]= new int[100][100];
        int b[][]=new int[100][100];
        int sum[][]=new int[100][100];
        int mul[][]=new int[100][100];

        System.out.println("enter size(row and column) of array- ");
        int n= sc.nextInt();
        
        System.out.println("enter the elements for first matrix- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements for second matrix- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("the first matrix is-");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("the second matrix is-");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("sum of the matrices is- ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
                
            }
        }
        for (int i = 0; i < n; i++)
        {
        for (int j = 0; j < n; j++)
        {
            mul[i][j] = 0;
            for (int k = 0; k < n; k++)
                mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
        }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("product of the matrices is- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mul[i][j]+"  ");
            }
            System.out.println();
        }

    }
}