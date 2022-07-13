public class numberTriangle {
    public static void main(String[] args) {
        numberTriangle(5);
        
      }
      public static void numberTriangle(int n){
         int val=1;
         for(int i=0;i<n;i++){
             for(int j=0;j<i+1;j++){
                  System.out.print(val+" ");
                  val++;
             }
             System.out.println();
         }
         
      
}
}
