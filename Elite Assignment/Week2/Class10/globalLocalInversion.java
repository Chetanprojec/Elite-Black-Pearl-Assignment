public class globalLocalInversion {
    public static void main(String[] args) {
        int[] arr={1,0,2};
        System.out.print( isIdeal(arr));
    }
    public static boolean isIdeal(int[] nums){
        int n= nums.length;
        int currmax=0;
        for(int i=0;i<n-2;i++){
            currmax = Math.max(currmax,nums[i]);
            if(currmax>nums[i+2]){
                return false;
            }
        }
        return true;
    }
}
