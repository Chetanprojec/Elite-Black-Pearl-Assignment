public class TriangleNumberReverse {
    public static void main(String[] args) {
       
      int n = 5 ;
         int sum=2,val=1;
         for(int i=0;i<n;i++){
             int temp=val;
             for(int j=0;j<i+1;j++){
                 System.out.print(val+" ");
                 val--;
             }
            val=temp+sum;
            sum++;
             System.out.println();
         }
         
      }
}
