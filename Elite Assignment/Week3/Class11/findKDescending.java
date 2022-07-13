public class FindKDescending{
    public static void main(String[] args) {
        int arr [] = {8,7,6,5,4,3,2,1};
        int target = 5 ;

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
          int  mid = start+(end-start)/2 ;
            if(arr[mid]<target){
                end = mid -1 ;
             
            }
            else if(arr[mid]>target){
               
                start = mid+1;
            }
            else{
                System.out.println("Index "+mid);
                break ;
            }
        }
    }
}