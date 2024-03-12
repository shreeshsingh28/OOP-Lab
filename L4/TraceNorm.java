import java.util.Scanner;

class TraceNorm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]= new int[100][100];
        int trace=0;
        double norm;
        int sum=0;

        System.out.println("enter size(row and column) of array- ");
        int n= sc.nextInt();
        
        System.out.println("enter the elements of matrix- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }


        System.out.println("the matrix is-");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            trace=trace+a[i][i];
            
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum=sum+a[i][j]*a[i][j];
            }
        }
        double sumd= (double) sum;
        norm =Math.pow(sumd,0.5);

        System.out.println("trace of the martix is- "+trace);
        System.out.println("norm of the martix is- "+norm);
        
        

        


    }
}