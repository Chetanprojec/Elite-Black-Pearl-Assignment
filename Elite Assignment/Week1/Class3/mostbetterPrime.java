public class mostbetterPrime {
    public static void main(String[] args) {
        int n = 8;
        int flag = 0 ;
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            flag = 1;
            break ;
        }
    }
    if(flag==1){
        System.out.println("Not Prime");
    }
    else{
        System.out.println("Prime");
    }
    }
    
}
