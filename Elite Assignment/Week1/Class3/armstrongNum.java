public class armstrongNum {
    public static void main(String[] args) {
        // int n = 153 ;
        int n = 123;
        int n1 = n  ;
        int num = 0 ;
        while(n>0){
            int rem = n%10;
            int cube = rem*rem*rem ;
            num = num+cube ;
            n/= 10 ;

        }
        if(n1!=num){
           
            System.out.println("Not Armstrong");
        }
        else{
            System.out.println("Armstrong");
        }
    }
    
}
