import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AggresiveCow {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(9);
        System.out.println(aggressiveCows(list,3));
    }
    public static int aggressiveCows(ArrayList<Integer> arr ,int cows){
        Collections.sort(arr);
        int start = 1 ;
        int n = arr.size();
        int end = arr.get(n-1) - arr.get(0);
        int ans = 0 ;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(arr,mid,cows)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid -1 ;
            }
        }
        return ans ;
    }
    private static boolean isPossible(ArrayList<Integer>arr,int range,int cows){
        int cowX = arr.get(0);
        int count = 1 ;
        for(int i=1;i<arr.size();i++){
            if(range<=arr.get(i)-cowX){
                count++;
                cowX = arr.get(i);
            }
            if(count == cows){
                return true ;
            }
        }
        return false ;
    }
}
