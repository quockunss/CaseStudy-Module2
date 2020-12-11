package controller;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void csvWriterProduct(String path, Product product) {
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            if (!file.exists()) {
                System.out.println("File not exits");
                file.createNewFile();
            }

            fileWriter = new FileWriter(file, true);
            fileWriter.append(String.valueOf(product.getId()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(product.getName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(product.getQuantity()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(product.getDesc());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(product.getPrice()));
            fileWriter.append(NEW_LINE_SEPARATOR);


        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    System.out.println("Write success!");
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void csvWriterProductUpdate(String path, ArrayList<Product> product) {
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            if (!file.exists()) {
                System.out.println("File not exits");
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);

            for (int i = 0; i < product.size(); i++) {
                fileWriter.write(String.valueOf(product.get(i).getId()));
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(product.get(i).getName());
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(String.valueOf(product.get(i).getQuantity()));
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(product.get(i).getDesc());
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(String.valueOf(product.get(i).getPrice()));
                fileWriter.write(NEW_LINE_SEPARATOR);
                fileWriter.flush();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    System.out.println("Write success!");
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static ArrayList<Product> readData() {
        ArrayList<Product> listProduct = new ArrayList<Product>();
        String fileIn = "product.csv";
        String line = null;

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileIn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null))
                    break;
            } catch (IOException exception) {
                System.out.println(exception);
            }
            String[] temp = line.split(COMMA_DELIMITER);
            int idProduct = Integer.parseInt(temp[0]);
            String productName = temp[1];
            int quantity = (int)Float.parseFloat(temp[2]);
            String desc = temp[3];
            float price = Float.parseFloat(temp[4]);
            listProduct.add(new Product(idProduct, productName, quantity, desc, price));
        }
        try {
            bufferedReader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return listProduct;
    }
}