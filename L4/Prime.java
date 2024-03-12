class Prime{
    
    int flag;
    
    boolean prime(int n){
        flag=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1)
        return true;
        else
        return false;
    }

    public static void main(String args[]){
        
        Prime ob;
        int cnt=0;
        int m=2;

        while(cnt!=12){
            boolean x=ob.prime(m++);
            if(x){
                cnt++;
                System.out.println(m);
            }
            
        }
    }
}