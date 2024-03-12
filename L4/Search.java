import java.util.Scanner;

class Search{
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

        System.out.println("enter element to search- ");
        int ele=sc.nextInt();

        int cnt=0;
        int flag=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)
            {
                flag=1;
                cnt++;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("frequency of "+ele+" is "+cnt);
        }
        else
        {
            System.out.println("elemant not present in array");
        }


}
}