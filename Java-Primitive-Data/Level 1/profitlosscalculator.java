public class ProfitLossCalculator {
    public static void main(String[] args) {
      
        double costPrice = 129.0;
        double sellingPrice = 191.0;
       
        double profit = sellingPrice - costPrice;
        
       
        double profitPercentage = (profit / costPrice) * 100;
        
   
        System.out.println("Cost Price: INR " + costPrice);
        System.out.println("Selling Price: INR " + sellingPrice);
        System.out.println("----------------------------");
        System.out.println("Profit Amount: INR " + profit);
        
        
        System.out.printf("Profit Percentage: %.2f%%\n", profitPercentage);
    }
}