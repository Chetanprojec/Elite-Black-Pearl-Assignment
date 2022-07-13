public class firstLastDigit{
    public static void main(String[] args) {
        int n = 321;
        int last = n%10 ;
        
        while(n>10){
            n = n/10;
          
      }
      int first = n ;
        System.out.println("last: "+last+"      "+"first: "+first);
    }
}