package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> stores = new TreeMap<>();

        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("Revision")) {
            String storeName = input[0];
            String product = input[1];
            double price = Double.parseDouble(input[2]);

            stores.putIfAbsent(storeName, new LinkedHashMap<>());
            stores.get(storeName).put(product, price);

            input = scanner.nextLine().split(", ");
        }

        stores.forEach((store, productAndPrice) -> {
            System.out.println(store + "->");
            productAndPrice.forEach((product,price) -> System.out.printf("Product: %s, Price: %.1f%n", product, price));
        });

    }

}
