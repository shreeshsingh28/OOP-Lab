import java.util.*;
class NewString {
    char arr[];
    NewString(char c[])
    {
        arr = new char[c.length];
        for(int i=0; i< c.length; i++)
        {
            arr[i] = c[i];
        }
    }
    void substring(int start)
    {
        if(start<0 || start>=arr.length)
        {
            System.out.println("Not possible!");
            return;
        }
        for(int i = start; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    void substring(int start, int end)
    {
        if(start<0 || start>=arr.length)
        {
            System.out.println("Not possible!");
            return;
        }
        if(end<1 || end>arr.length)
        {
            System.out.println("Not possible!");
            return;
        }
        if(start>end)
        {
            System.out.println("Not possible!");
            return;
        }
        for(int i = start; i<end; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    char charAt(int i)
    {
        return arr[i];
    }
    void toLowerCase()
    {
        for(int i = 0; i< arr.length; i++)
        {
            char aChar = arr[i];
            if (65 <= aChar && aChar<=90)
            {
                aChar = (char)(aChar + 32) ;
                arr[i] = aChar;
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    void toUpperCase()
    {
        for(int i = 0; i< arr.length; i++)
        {
            char aChar = arr[i];
            if (92 <= aChar && aChar<=122)
            {
                aChar = (char)(aChar - 32) ;
                arr[i] = aChar;
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    int indexOf(char ch)
    {
        for(int i = 0; i< arr.length; i++)
        {
            if (arr[i]==ch)
            {
                return i;
            }
            
        }
        return -1;
    }
    int lastIndexOf(char ch)
    {
        for(int i = arr.length-1; i>=0; i--)
        {
            if (arr[i]==ch)
            {
                return i;
            }
            
        }
        return -1;
    }
    void startsWith(NewString st) 
    {
        boolean ans = true;
        if(st.arr.length>arr.length)
        {
            ans=false;
        }
        else
        {
            for(int i=0; i<st.arr.length; i++)
            {
                if(arr[i]!=st.arr[i])
                {
                    ans = false;
                    break;
                }
            }
        }
        if(ans)
        {
            System.out.println("YES!");
        }
        else
        {
            System.out.println("NO!");
        }
    }
    void endsWith(NewString st) 
    {
        boolean ans = true;
        if(st.arr.length>arr.length)
        {
            ans=false;
        }
        else
        {
            int cnt = 1;
            while(cnt<=st.arr.length)
            {
                if(arr[arr.length - cnt]!=st.arr[st.arr.length - cnt])
                {
                    ans = false;
                    break;
                }
                cnt++;
            }
        }
        if(ans)
        {
            System.out.println("YES!");
        }
        else
        {
            System.out.println("NO!");
        }
    }
    boolean equals(char c[])
    {
        if(c.length!=arr.length)
        {
            return false;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=c[i])
            {
                return false;
            }
        }
        return true;
    }
    int compareTo(char ch[])
    {
        int l1 = arr.length;
        int l2 = ch.length;
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
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
		char arr[] = sc.next().toCharArray();
		NewString a = new NewString(arr);
		System.out.println("1. substring(start)");
	    System.out.println("2. substring(start, end)");
	    System.out.println("3. toUpperCase() ");
	    System.out.println("4. toLowerCase()");
	    System.out.println("5. charAt(int i)");
	    System.out.println("6. indexOf(ch)");
	    System.out.println("7. lastIndexOf(ch) ");
	    System.out.println("8. startsWith(st) ");
	    System.out.println("9. endsWith(st) ");
	    System.out.println("10. equals(char c[])");
	    System.out.println("11. compareTo(char c[])");
	    System.out.println("12. quit");
		while(true)
		{
		    System.out.println("Enter option");
		    int opt = sc.nextInt();
		    if(opt==1)
		    {
		        System.out.println("Enter Start");
		        a.substring(sc.nextInt());
		    }
		    else if(opt == 2)
		    {
		        System.out.println("Enter Start and End");
		        a.substring(sc.nextInt(), sc.nextInt());
		    }
		    else if(opt == 3)
		    {
		        a.toUpperCase();
		    }
		    else if(opt == 4)
		    {
		        a.toLowerCase();
		    }
		    else if(opt == 5)
		    {
		        System.out.println("Enter i");
		        System.out.println(a.charAt(sc.nextInt()));
		    }
		    else if(opt == 6)
		    {
		        System.out.println("Enter ch");
		        int ans = a.indexOf(sc.next().charAt(0));
		        if(ans==-1)
		        {
		            System.out.println("Not Found");
		        }
		        else
		        {
		            System.out.println("Found at: "+ans);
		        }
		    }
		    else if(opt == 7)
		    {
		        System.out.println("Enter ch");
		        int ans = a.lastIndexOf(sc.next().charAt(0));
		        if(ans==-1)
		        {
		            System.out.println("Not Found");
		        }
		        else
		        {
		            System.out.println("Found at: "+ans);
		        }
		    }
		    else if(opt == 8)
		    {
		        System.out.println("Enter characters");
		        NewString temp = new NewString(sc.next().toCharArray());
		        a.startsWith(temp);
		    }
		    else if(opt == 9)
		    {
		        System.out.println("Enter characters");
		        NewString temp = new NewString(sc.next().toCharArray());
		        a.endsWith(temp);
		    }
		    else if(opt == 10)
		    {
		        System.out.println("Enter characters");
		        System.out.println(a.equals(sc.next().toCharArray()));
		    }
            else if(opt == 11)
            {
                System.out.println("enter string to compare- ");
                char ch[] = new char[100];
                ch = sc.next().toCharArray();
                System.out.println(a.compareTo(ch));
            }
		    else if(opt == 12)
		    {
		        break;   
		    }
		}
		
		
	}
}