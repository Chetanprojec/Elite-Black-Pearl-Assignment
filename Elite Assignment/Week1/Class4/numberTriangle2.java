public class numberTriangle2 {
    public static void main(String[] args) {
        int n = 5 ;         
         for(int i=0;i<n;i++){
             int val=1;
             for(int j=0;j<i+1;j++){
                  System.out.print(val+" ");
                  val++;
             }
             System.out.println();
         }
         
      } 
}
