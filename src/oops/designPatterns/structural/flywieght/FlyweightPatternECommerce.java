package oops.designPatterns.structural.flywieght;

public class FlyweightPatternECommerce {
    /**
     * In an e-commerce website, we have thousands of products that need to be displayed. However,
     * each product contains a lot of repetitive data, such as:
     *
     * Product Name
     * Brand
     * Category
     * Description
     * Instead of creating a new object for every product, we use the Flyweight
     * pattern to store shared product details once and only store unique details (like price and stock) separately
     * @param args
     */
    public static void main(String[] args) {
        ProductFlyweight product1 = ProductFactory.getProduct("iPhone 15", "Apple", "Smartphone", "Latest Apple smartphone");
        product1.displayProductDetails("$999", 10);

        ProductFlyweight product2 = ProductFactory.getProduct("iPhone 15", "Apple", "Smartphone", "Latest Apple smartphone");
        product2.displayProductDetails("$1099", 5);

        ProductFlyweight product3 = ProductFactory.getProduct("Galaxy S23", "Samsung", "Smartphone", "Flagship Samsung smartphone");
        product3.displayProductDetails("$899", 8);

        ProductFlyweight product4 = ProductFactory.getProduct("iPhone 15", "Apple", "Smartphone", "Latest Apple smartphone");
        product4.displayProductDetails("$950", 12);

        System.out.println("Total unique product objects created: " + ProductFactory.getProductCount());
    }
}
