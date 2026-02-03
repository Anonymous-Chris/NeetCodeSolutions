package slidingwindow.besttimetobuyandsellstock;

import arrays.print.PrintItem;

public class GreedyWithMinPrice {
    static void main(String[] args) {
        int [] prices = {10,1,5,6,7,1};
        int [] prices1 = {10,8,7,5,2};
        PrintItem.print(maxProfit(prices));
        PrintItem.print(maxProfit(prices1));
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
//TC: O(n)
//SC: O(1)