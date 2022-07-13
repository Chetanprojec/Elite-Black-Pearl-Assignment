public class primebetter {
    public static void main(String[] args) {
        int n = 8;
        int flag = 0 ;
    for(int i=2;i<=n/2;i++){
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
