package arrays;

public class StockBuySell
{
    static void getMaxProfit(int arr[])
    {
        int buyPrices[] = new int[arr.length];
        int sellPrices[] = new int[arr.length];
        // 100, 180, 260, 310, 40, 535, 695
        int maxProfit=0;
        int latestBuyPrice = 0;
        for (int i = 0; i < arr.length; i++)
        {
            // BUY
            if (i == 0 && arr[i] < arr[i + 1])
            {
                System.out.println("the buy day is " + i + " the price is " + arr[i]);
                buyPrices[i] = arr[i];
                latestBuyPrice = arr[i];
            }
            if(i> 0 && i < arr.length-1 && arr[i]  < arr[i+1] && arr[i] < arr[i-1] )
            {
                System.out.println("the buy day is " + i + " the price is " + arr[i]);
                buyPrices[i] = arr[i];
                latestBuyPrice = arr[i];
            }
            // SELL
            if (i == arr.length-1 && arr[i] > arr[i - 1])
            {
                System.out.println("the sell day is " + i + " the price is " + arr[i]);
                sellPrices[i] = arr[i];
                maxProfit = maxProfit + arr[i] - latestBuyPrice;
            }
            if (i> 0 && i < arr.length-1 && arr[i] > arr[i + 1] && arr[i] > arr[i - 1])
            {
                System.out.println("the sell day is " + i + " the price is " + arr[i]);
                sellPrices[i] = arr[i];
                maxProfit = maxProfit + arr[i] - latestBuyPrice;
            }
        }
        /*for(int i =0; i<buyPrices.length; i++)
        {
            maxProfit = maxProfit + sellPrices[i] - buyPrices[i];
        }*/
        System.out.println("The maximum profit is " + maxProfit);
    }

    public static void main(String args[]) {
        int arr[] = {100, 180, 260, 310, 40, 535, 695};
        StockBuySell s = new StockBuySell();
        s.getMaxProfit(arr);
    }
}
