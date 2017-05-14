package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    private static String fileName;

    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        fileName = consoleReader.readLine();
        consoleReader.close();

        String mode = args[0];
        switch (mode) {
            case "-c": {
                String name = args[1];
                if (args.length > 4) {
                    for (int i = 2; i < args.length - 2; i++) {
                        name += " " + args[i];
                    }
                }

                Double price = Double.parseDouble(args[args.length - 2]);
                Integer quantity = Integer.parseInt(args[args.length - 1]);

                addProduct(name, price, quantity);
                break;
            }
        }
    }

    public static void addProduct(String name, Double price, Integer quantity) throws IOException {
        Long id = getId() + 1;

        String product = "\r\n" + String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileOutputStream.write(buffer);
        fileOutputStream.write(product.getBytes());

        fileOutputStream.close();
    }

    public static Long getId() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        long maxId = 0;
        String line;

        while (fileReader.ready()) {
            line = fileReader.readLine().split(" ")[0];
            if (line.length() > 8) {
                line = line.substring(0, 8);
            }

            long id = Long.parseLong(line.trim());
            if (id > maxId) {
                maxId = id;
            }
        }

        fileReader.close();

        return maxId;
    }
}
