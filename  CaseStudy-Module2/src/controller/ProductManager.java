package controller;

import model.Product;
import view.App;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    public void insert(){
        System.out.println("Nhập thông tin sản phẩm: ");
        try {
            System.out.println("Mã sản phẩm: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Tên sản phẩm: ");
            String name = sc.nextLine();

            System.out.println("Số lượng: ");
            int quantity = sc.nextInt();

            sc.nextLine();

            System.out.println("Mô tả: ");
            String desc = sc.nextLine();

            System.out.println("gia tien:");
            float price = sc.nextFloat();

            Product p = new Product(id,name,quantity,desc,price);
            App.PRODUCTS.add(p);
        } catch (InputMismatchException em){
            System.out.println("loi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void show(){
        System.out.println("DAnh sach san pham");
        String header = String.format("%s%15s%30s%15s%15s", "ma","ten","so luong","gia","ghi chu");
        System.out.println(header);
        for(Product p : App.PRODUCTS){
            String infor = String.format("%s%15s%30s%15s%15s", p.getId(),p.getName(),p.getQuantity(),p.getPrice(),p.getDesc());
            System.out.println(infor);
        }
    }


    public void update(){
        try {
            System.out.println("nhap ma: ");
            Integer id = sc.nextInt();
            Product product = null;
            for(Product p : App.PRODUCTS){
                if(p.getId() == id) {
                    product = p;
                    break;
                }
            }
            if (product == null){
                System.out.println("ma san pham khong ton tai, nhap lai: ");
            }
            System.out.println("thong tin san pham");
            String header = String.format("%s%15s%30s%15s%15s","ma","ten","so luong","gia","ghi chu");
            System.out.println(header);
            String infor = String.format("%s%15s%30s%15s%15s", product.getId(),product.getName(),product.getQuantity(),product.getPrice(),product.getDesc());
            System.out.println(infor);
            for (int i = 0; i < App.PRODUCTS.size(); i++){
                if (App.PRODUCTS.get(i).getId() == id){
                    sc.nextLine();

                    System.out.println("Tên sản phẩm: ");
                    String name = sc.nextLine();

                    System.out.println("Số lượng: ");
                    int quantity = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Mô tả: ");
                    String desc = sc.nextLine();

                    System.out.println("gia tien:");
                    float price = sc.nextFloat();

                    App.PRODUCTS.get(i).setName(name);
                    App.PRODUCTS.get(i).setQuantity(quantity);
                    App.PRODUCTS.get(i).setDesc(desc);
                    App.PRODUCTS.get(i).setPrice(price);
                }
            }
        } catch (InputMismatchException em){
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(){
        try {
            System.out.println("nhap ma: ");
            Integer id = sc.nextInt();
            Product product = null;
            for (Product p : App.PRODUCTS){
                if (p.getId() == id){
                    product = p;
                    break;
                }
            }
            App.PRODUCTS.indexOf(product);
            App.PRODUCTS.remove(App.PRODUCTS.indexOf(product));
            if (product == null){
                System.out.println("ma san pham khong ton tai, xin nhap lai: ");
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Product getById(int id){
        Product product = new Product();
        for(Product p : App.PRODUCTS){
            if(p.getId() == id) {
                product = p;
                break;
            }
        }
        return product;
    }



}

