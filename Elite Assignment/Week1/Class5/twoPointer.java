public class twoPointer {
    public static void main(String[] args) {
    int arr [] = {1,2,3,4,6};
    int target = 5 ;
    int i=0;
    int j =arr.length-1;
    while(i<j){
        int sum = arr[i]+arr[j];
        if(sum<target){
            i++;

        }else if(sum>target){
            j-- ;
        }{
            System.out.println(arr[i]+" "+arr[j]);
            i++;
            j--;
        }
    }
 
} 
} 

