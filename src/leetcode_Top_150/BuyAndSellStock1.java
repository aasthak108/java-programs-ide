package leetcode_Top_150;
/*You are given an array prices where prices[i] is the price
        of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one
        stock and choosing a different day in the future to sell that stock.*/
public class BuyAndSellStock1 {

    public static int maxProfit(int [] prices){
        int maxProfit =0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            else if(prices[i]-buy>maxProfit){
                maxProfit = prices[i] - buy;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int[] prices = {7,1,6,3,6,4};
        System.out.println("" + maxProfit(prices));

    }
}
