public class continousSubarraySum{
    public static void main(String[] args) {
    int arr [] = {23,2,4,6,7};
    int k  = 6;

     boolean ans = checksubArray(arr,k);
     System.out.println(ans);
    }
    public static boolean checksubArray(int nums[],int k){
        int prefixSum = nums[0] ;
    
        for(int  i=1;i<nums.length;i++){
    
            if(nums[i]==nums[i-1]){
                if( nums[i]==0||nums[i]%k==0){
                    return true ;
             }
            }
             prefixSum += nums[i];

             if(prefixSum%k==0){
                return true ;
             }
             int temp = prefixSum;
             int left_pos = 0;

             while(temp>=k && i-left_pos>1){
                temp -= nums[left_pos++];
                if(temp%k==0){
                    return true ;
                }
             }
       }
    
    return false ;
}
}