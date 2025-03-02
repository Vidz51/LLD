package oops.designPatterns.structural.flywieght;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory: Factory ensures that products with the same name, brand, and category are reused instead of creating duplicates.
public class ProductFactory {
    private static final Map<String, ProductFlyweight> productMap = new HashMap<>();

    public static ProductFlyweight getProduct(String name, String brand, String category, String description) {
        String key = name + brand + category;
        if (!productMap.containsKey(key)) {
            productMap.put(key, new ProductConcrete(name, brand, category, description));
            System.out.println("Creating new product flyweight for: " + name);
        }
        return productMap.get(key);
    }

    public static int getProductCount() {
        return productMap.size();
    }

}
