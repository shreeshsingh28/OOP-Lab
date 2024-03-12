import java.util.Scanner;
class Book {
    
    String tittle;
    String author;
    int edition;
    
    Book(){}

    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter tittle-");
        String tit=sc.next();
        tittle=tit;
        System.out.println("enter author name-");
        String au=sc.next();
        author=au;
        System.out.println("enter edition");
        int ed=sc.nextInt();
        edition=ed;
    }

    void display(String str)
    {
        if(author.equals(str))
        System.out.println("book tittle- "+tittle+" edition- "+edition);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book arr[] = new Book[3];

        for(int i=0;i<3;i++)
        {
            arr[i]=new Book();
        }

        for(int i=0;i<3;i++)
        {
            System.out.println("for book "+(i+1)+"- ");
            arr[i].getdata();
        }

        System.out.println("enter name of author to search- ");
        String str = sc.next();

        for(int i=0;i<3;i++)
        {
            arr[i].display(str);
        }


    }
    
    
    
    
}
