package DSA.Array;

class BestTimeToSell {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
        int answer = 0;

        for (int i =1;i< prices.length; i++) {
            answer = Math.max(answer, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return answer;
    }
}