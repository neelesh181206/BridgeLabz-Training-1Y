class Order {

    int orderId;
    double baseAmount;

    static double deliveryCharge = 40;

    // Constructor
    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    // Method to calculate bill
    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {

    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    // No discount
    @Override
    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class PremiumOrder extends Order {

    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    // 20% discount
    @Override
    double calculateBill() {
        double discount = baseAmount * 0.20;
        return (baseAmount - discount) + deliveryCharge;
    }
}

public class FoodApp {

    public static void main(String[] args) {

        // Polymorphism
        Order o1 = new RegularOrder(101, 500);
        Order o2 = new PremiumOrder(102, 500);

        System.out.println("Regular Order Bill: ₹" + o1.calculateBill());
        System.out.println("Premium Order Bill: ₹" + o2.calculateBill());
    }
}