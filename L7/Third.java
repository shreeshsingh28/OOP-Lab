import java.util.Scanner;
class Third{
    int compareTo(char ch[])
    {
        int l1 = arr.length();
        int l2 = ch.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)arr[i];
            int str2_ch = (int)ch[i];
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
    }
}