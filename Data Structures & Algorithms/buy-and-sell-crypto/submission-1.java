class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = prices[0];
        int cheapestDate = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= cheapest) {
                cheapest = prices[i];
                cheapestDate = i;
            }
        }
        
        int expensive = cheapest;


        for (int i = cheapestDate + 1; i < (prices.length - cheapestDate); i++) {
            if (prices[i] > expensive) {
                expensive = prices[i];
            }
        }

        return expensive - cheapest;
    }
}
