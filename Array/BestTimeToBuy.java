package DSA.Array;

class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int min = prices[0];   // buy price
        int profit = 0;        // max profit

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];  // found cheaper buy
            } else {
                profit = Math.max(profit, prices[i] - min);
            }
        }

        return profit;
    }
}