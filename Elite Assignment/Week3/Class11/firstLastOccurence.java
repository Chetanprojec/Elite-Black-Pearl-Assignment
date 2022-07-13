public class firstLastOccurence {
    public static void main(String[] args) {
        
        int arr [] = {5,7,7,8,8,10};
        int target = 8 ;
        int start = 0;
        int end = arr.length-1 ;
        int ans [] = new int[2];
        ans[0] = Second(arr,target,start,end);
        ans[1] = first(arr,target,start,end);
        System.out.println(ans[0]+" "+ans[1]);

    }
    public static int first(int arr[],int target,int start,int end){
      int   ans = -1 ;
      while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]<=target){
            start = mid + 1 ;
        }
        if(arr[mid]>target){
            end = mid - 1;
        }
        if(arr[mid]==target){
            ans = mid ;
        }
      }


        return ans ;
    }
    public static int Second(int arr[],int target,int start,int end){
      int   ans = -1 ;
      while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]<target){
            start = mid + 1 ;
        }
        if(arr[mid]>=target){
           
            end = mid - 1;
        }
        if(arr[mid]==target){
            ans = mid ;
        }
      }
        
        return ans;
    }
}
