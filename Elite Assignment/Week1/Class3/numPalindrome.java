public class numPalindrome {
    public static void main(String[] args) {
        int n = 121 ; int n1 = n ;
        int n2 = 0 ;
        while(n>0){
            int rem = n%10 ;
            n2 = n2*10+rem ;
            n = n/10 ;

        }

       
        if(n1!=n2){
            
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }
    
}
