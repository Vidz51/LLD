package oops.designPatterns.structural.flywieght;

// Concrete Flyweight

/**
 * This class holds intrinsic state (shared data) and extrinsic state (unique data).
 *  Intrinsic State (Shared) → Name, Brand, Category, Description
 * 💡 Extrinsic State (Unique) → Price, Stock
 */
public class ProductConcrete implements ProductFlyweight {
    private final String name;
    private final String brand;
    private final String category;
    private final String description;

    public ProductConcrete(String name, String brand, String category, String description) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.description = description;
    }

    @Override
    public void displayProductDetails(String price, int stock) {
        System.out.println("Product: " + name + ", Brand: " + brand + ", Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price + ", Stock: " + stock);
        System.out.println("---------------------------------------");
    }
}
