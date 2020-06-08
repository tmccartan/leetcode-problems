package arrays;

public class BestTimeToSellStockI {

    /*
    *
    * Say you have an array for which the ith element is the price of a given stock on day i.

    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

    Note that you cannot sell a stock before you buy one.
    * */
    public static int bestTimeToSellStock(int [] stockValues){
        int maxProfit = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < stockValues.length; i++){
            if(stockValues[i] < minPrice){
                minPrice = stockValues[i];
            }
            if(stockValues[i] - minPrice > maxProfit){
                maxProfit = stockValues[i] - minPrice;
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
