package slidingwindow.besttimetobuyandsellstock;

import arraysandhashing.print.PrintItem;

public class SlidingWindow {
    static void main(String[] args) {
        int [] prices = {10,1,5,6,7,1};
        int [] prices1 = {10,8,7,5,2};
        PrintItem.print(maxProfit(prices));
        PrintItem.print(maxProfit(prices1));
    }
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right =1;
        int maxProfit = 0;
        while (right<prices.length){
            if(prices[right]>prices[left]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            }else{
                //found a cheaper price, move the pointer
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
//TC: O(n)
//SC: O(1)