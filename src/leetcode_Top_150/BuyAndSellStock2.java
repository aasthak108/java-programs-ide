package leetcode_Top_150;
/* You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

 */

public class BuyAndSellStock2 {
    public static int maxProfit(int[] prices) {
        int buy =prices[0];
        int maxProfit =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                maxProfit = maxProfit + (prices[i]-buy);
            }
            buy = prices[i];
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(""+ maxProfit(arr));
    }

}
