
import java.util.*;
public class BuyAndSellStock {

    public static int stock(int prices[]){
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                profit = prices[i]-buy;
maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
      int p[] = {7,1,5,3,6,4};
      System.out.println(stock(p));
    }
}
