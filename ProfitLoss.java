public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int selPrice = 191;
        int profit = selPrice - costPrice;
        double profitPercent = (profit / (double)costPrice) * 100;
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + selPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
        );
    }
}

