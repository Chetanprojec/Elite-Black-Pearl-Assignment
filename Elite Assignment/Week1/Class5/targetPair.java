public class targetPair {
    public static void main(String[] args) {
        
    
    int arr [] = {1,2,3,4,6};
    int target = 5 ;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i;j<arr.length;j++){
            if((arr[i]+arr[j])==target){
             System.out.println(arr[i]+" "+arr[j]);
                break;
            }
        }
    } 
}  
}
