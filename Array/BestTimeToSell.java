package DSA.Array;

class BestTimeToSell {
    public int maxProfit(int[] prices) {
       int[] profit = new int[prices.length];

        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {

            min = Math.min(min, prices[i]);

            profit[i] = Math.max(
                profit[i - 1],
                prices[i] - min
            );
        }

        return profit[prices.length - 1];
    }
}