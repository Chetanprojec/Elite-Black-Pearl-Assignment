public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,7,6};
        missingNum(arr);
    }
    public static void missingNum(int[] arr){
        int n=arr.length+1;
        int sum = n*(n+1)/2;
        for(int ele:arr){
            sum-=ele;
        }
        System.out.print(sum);
    }
}
