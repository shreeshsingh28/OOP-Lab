import java.util.Scanner;

class MagicSq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]= new int[100][100];

        System.out.println("enter size(row and column) of array- ");
        int n= sc.nextInt();
        System.out.println("enter the elements- ");

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

    
    int arr[]= new int[100];
    int x = 0;
    int sum;
    for (int i = 0; i < n; i++)
    {
        sum = 0;
        for (int j = 0; j < n; j++)
        {
            sum = sum + a[i][j];
        }
        arr[x++] = sum;
    }
    for (int i = 0; i < n; i++)
    {
        sum = 0;
        for (int j = 0; j < n; j++)
        {
            sum = sum + a[j][i];
        }
        arr[x++] = sum;
    }
    sum = 0;
    for (int j = 0; j < n; j++)
    {
        sum = sum + a[j][j];
    }
    arr[x++] = sum;
    
    sum=0;
    int k=0;
        for(int j=n-1;j>=0;j--){
            sum=sum+a[k++][j];
        }
    arr[x++]=sum;
    
    
    int flag = 1;
    for (int i = 1; i < 2 * n + 1; i++)
    {
        if (arr[0] != arr[i])
        {
            flag = 0;
            break;
        }
    }
    for (int j = 0; j < 2*n+1; j++)
    {
        System.out.print(arr[j]+" ");
    }
    

    if (flag==1)
    {
        System.out.println("magic square");
    }
    else
    {
        System.out.println("not a magic square");
    }
}
}