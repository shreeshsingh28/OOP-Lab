class call{
    synchronized void callme(int i)
    {
        for (int j =1; j <= 10 ;j++ ) {
            System.out.println(i*j);
        }
    }
}

class NewThread implements Runnable{
    Thread t;
    call ob;
    int a;

    NewThread(call tar,int i)
    {
        ob = new call();
        ob = tar;
        a=i;
        t = new Thread(this);
        System.out.println(t);
        t.start();
    }

    public void run(){
        try {
            ob.callme(a);
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.print("error");
        }
    }
}
public class MTh {
    public static void main(String[] args) {
        call ob = new call();
            new NewThread(ob,3);
            new NewThread(ob,5);
    }

}
