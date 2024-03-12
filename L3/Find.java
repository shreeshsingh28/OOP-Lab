import java.util.Scanner;

class Find{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,1,2,1,5,6,7};
        
        System.out.println("enter element to search- ");
        int ele=sc.nextInt();

        System.out.println("index position of "+ele+" is- ");
        int flag=1;
        for (int i = 0; i < 9; i++) {
            if (arr[i]==ele) {
                System.out.println(i);
                flag=0;
            }
        }
        if (flag==1) 
            System.out.println("element not found");
    }
}