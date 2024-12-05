public class solution {
    public static int BuyandandSell(int price[]){
        int buypric = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit = 0;
        for (int i = 0; i < price.length; i++) {
            // profit
            if (buypric < price[i]) {
                profit = price[i] - buypric;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buypric = price[i];
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 6, 3, 4 };
        System.out.println(BuyandandSell(price));
    }
}
