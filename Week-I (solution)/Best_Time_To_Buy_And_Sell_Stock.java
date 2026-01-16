public class Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
    // Brute Force
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            for (int j = i + 1; j < prices.length; j++){
                int profit = prices[j] - prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    // Optimized
    public int maxProfit1(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++){
            if (buy > prices[i]){
                buy = prices[i];
            }
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }

}
