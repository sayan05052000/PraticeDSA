package sorting.questions;

public class StockSellBestDay {
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minElementTillI = prices[0];
        for(int i = 1;i<prices.length;i++){
            minElementTillI = Math.min(minElementTillI,prices[i-1]);
            int profit = prices[i] - minElementTillI;
            if (profit>0){
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
