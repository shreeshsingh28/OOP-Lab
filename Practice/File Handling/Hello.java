import java.io.*;

public class Hello {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\handle");
        System.out.println(f.exists());
        String s[] = f.list();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        
    }
    
}
