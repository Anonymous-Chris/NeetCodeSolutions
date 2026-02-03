package slidingwindow.besttimetobuyandsellstock;

import arrays.print.PrintItem;

public class KadaneAlgorithm {
    static void main(String[] args) {
        int [] prices = {10,1,5,6,7,1};
        int [] prices1 = {10,8,7,5,2};
        PrintItem.print(maxProfit(prices));
        PrintItem.print(maxProfit(prices1));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;

        for(int i=1; i<prices.length;i++){
            currentProfit += prices[i] - prices[i-1];
            //remove negative
            currentProfit = Math.max(currentProfit, 0);
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}
//TC: O(n)
//SC: O(1)