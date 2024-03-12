import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        File f1 = new File("D:\\Work\\College\\Sem-III\\OOP Lab\\Practice\\File Handling\\file.txt");
        File f2 = new File("D:\\Work\\College\\Sem-III\\OOP Lab\\Practice\\File Handling\\file1.txt");
        
        Writer w = new FileWriter(f1);
        Reader r = new FileReader(f1);
        BufferedReader b = new BufferedReader(r);
        
        String name;
        String regno;
        String marks;
        String s;

        for (int i = 0; i < 3; i++) {
            name = sc.next();
            regno = sc.next();
            marks = sc.next();
            s = new String(name+":"+regno+":"+marks+"\n");
            w.write(s);
        }
        w.close();

        String str[] = new String[3];

        for (int i = 0; i < 3; i++) {
            str[i] = b.readLine();
            System.out.println(str[i]);
        }
        char arr[][] = new char[3][100];

        for (int i = 0; i < 3; i++) {
            int k=0;
            for (int j = str[i].lastIndexOf(":")+1; j < str[i].length(); j++) {
                if (str[i].charAt(j)>='0' || str[i].charAt(j)<='9' ) {
                    arr[i][k++]=str[i].charAt(j);
                }
            }
            arr[i][k++]='\0';
        }

        int irr[] = new int[3];
        String a[] = new String[3];

        for (int i = 0; i < arr.length; i++) {
            a[i] = new String(arr[i]);
            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < 3; i++) {
            irr[i]  = Integer.parseInt(a[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(irr[i]);
        }




    }
}
