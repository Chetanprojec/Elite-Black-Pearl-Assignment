public class fibonaci {
    public static void main(String[] args) {
        int n = 20 ;
        int val = 0;
        int val2 = 1 ;
        System.out.print(val+" "+val2);
        for(int i=3;i<=n;i++){
            int val3 = val + val2;
            System.out.print(" "+val3);
            val = val2;
            val2 = val3 ;

        }
    }
    
}
