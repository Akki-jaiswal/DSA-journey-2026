package Arrays.Medium;

public class BuySellStock {
    static void main(String[] args) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int[] prices = {7,1,2,4,3,5,3};
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maxProfit = Math.max(maxProfit, price-minPrice);
            }
        }
        System.out.println(maxProfit);
    }
}
