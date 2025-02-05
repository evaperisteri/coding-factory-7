package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products1 = List.of(new Product("", 12.5, 10), //immutable list
                new Product("", 12.5, 10));

        List<Product> products2 = Arrays.asList(new Product("", 12.5, 10), //partially immutable list
                new Product("", 12.5, 10));

        List<Product> products = new ArrayList<>(List.of(new Product("Apples", 12.5, 10), //mutable list
                new Product("Oranges", 12.5, 10), new Product("Berries", 12.5, 10),
                new Product("Apples", 32.5, 17)));

        products.sort(Comparator.naturalOrder());           //sort based on comparable
        products.sort(Comparator.reverseOrder());           //sort based on comparable

//        products.sort(Comparator.comparing(p -> p.getName()));
        products.sort(Comparator.comparing(Product::getName));
        products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity));
        products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity).thenComparing(Product::getPrice).reversed());
        products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity, Comparator.reverseOrder()));

        products.forEach(System.out::println);
    }


}
