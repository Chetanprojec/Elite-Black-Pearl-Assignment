public class buySellStocks {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int curMin = prices[0];
        int maxProfit = 0 ;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>curMin){
               int profit = prices[i]-curMin ;
                maxProfit = Math.max(profit,maxProfit);
            }
            curMin = Math.min(prices[i],curMin);
        }
        
        return maxProfit ;

    }
    
}
