package slidingwindow.besttimetobuyandsellstock;

import arraysandhashing.print.PrintItem;

public class BruteForceSolution {
    static void main(String[] args) {
        int [] prices = {10,1,5,6,7,1};
        int [] prices1 = {10,8,7,5,2};
        PrintItem.print(maxProfit(prices));
        PrintItem.print(maxProfit(prices1));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                //sell-buy
                maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
            }
        }
        return maxProfit;
    }
}
//TC: O(n2)
//SC: O(1)