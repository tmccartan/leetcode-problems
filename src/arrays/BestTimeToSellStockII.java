package arrays;

public class BestTimeToSellStockII {

    /*
    *
        Say you have an array for which the ith element is the price of a given stock on day i.

        Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

        Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
    * */
    public static int bestTimeToSellStock(int [] stockValues){
        if(stockValues == null || stockValues.length == 0) {
            return 0;
        }

        int maxProfit = 0;

        for(int i = 1; i < stockValues.length; i++){
            if(stockValues[i] > stockValues[i-1]){
                maxProfit +=   stockValues[i] - stockValues[i-1];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args){

        int[] stocks = new int[] {7,1,5,3,6,4};
        System.out.println(bestTimeToSellStock(stocks));

        int [] stocks2 = new  int[]{7,6,4,3,1};
        System.out.println(bestTimeToSellStock(stocks2));

    }
}
