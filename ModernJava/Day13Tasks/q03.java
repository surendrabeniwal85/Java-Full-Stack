package ModernJava.Day13Tasks;

//Product category analysis using collectors

import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

public class q03 {
    public static void main(String[] args) {

        List<Product> p = Arrays.asList(
            new Product("Laptop", "Electronics", 60000),
            new Product("Mobile", "Electronics", 30000),
            new Product("Shirt", "Clothing", 2000),
            new Product("Jeans", "Clothing", 3000)
        );

        Map<String, Double> a = p.stream()
                .collect(Collectors.groupingBy(
                        x -> x.category,
                        Collectors.averagingDouble(x -> x.price)
                ));

        System.out.println(a);
    }
}
