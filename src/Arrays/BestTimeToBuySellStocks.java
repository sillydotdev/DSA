package Arrays;//----------Best time to Buy and Sell stocks------------

public class BestTimeToBuySellStocks {

    public static int buyAndSellStock(int prices[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice; //todays profit
                maxProfit = Math.max(maxProfit, profit); //max profit you can get
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit: "+buyAndSellStock(prices));

    }
    
}
