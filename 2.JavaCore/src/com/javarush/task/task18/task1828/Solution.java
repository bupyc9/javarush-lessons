package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static String fileName;

    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        fileName = consoleReader.readLine();
        consoleReader.close();

        String mode = args[0];
        switch (mode) {
            case "-u": {
                updateProduct(args[1], args[2], args[3], args[4]);
                break;
            }
            case "-d": {
                Long id = Long.parseLong(args[1]);
                deleteProduct(id);
                break;
            }
        }
    }

    public static List<String> readProducts() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        List<String> products = new ArrayList<>();
        while(fileReader.ready()) {
            products.add(String.format("%s%n", fileReader.readLine()));
        }
        fileReader.close();

        return products;
    }

    private static void saveProducts(List<String> products) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (String product: products) {
            writer.write(product);
        }
        writer.close();
    }

    private static void deleteProduct(Long id) throws IOException {
        List<String> products = readProducts();

        for (int i = 0; i < products.size(); i++) {
            Long productId = Long.parseLong(products.get(i).substring(0, 8).trim());
            if (productId.equals(id)) {
                products.remove(i);
            }
        }

        saveProducts(products);
    }

    private static void updateProduct(String id, String name, String price, String quantity) throws IOException {
        List<String> products = readProducts();

        for (int i = 0; i < products.size(); i++) {
            String productId = products.get(i).substring(0, 8).trim();
            if (productId.equals(id)) {
                products.set(i, String.format("%-8s%-30s%-8s%-4s%n", id, name, price, quantity));
            }
        }

        saveProducts(products);
    }
}
