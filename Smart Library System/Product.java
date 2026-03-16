class Product {

    int productId;
    String productName;

    // Constructor
    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Method to check keyword match
    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}

class ElectronicProduct extends Product {

    String brand;

    // Constructor
    ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }

    // Override method
    @Override
    boolean isMatch(String keyword) {

        return productName.toLowerCase().contains(keyword.toLowerCase())
                || brand.equalsIgnoreCase(keyword);
    }
}

public class ECommerceApp {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop");
        ElectronicProduct p2 = new ElectronicProduct(102, "Smartphone", "Samsung");

        System.out.println("Search Laptop: " + p1.isMatch("lap"));
        System.out.println("Search Samsung: " + p2.isMatch("Samsung"));
    }
}