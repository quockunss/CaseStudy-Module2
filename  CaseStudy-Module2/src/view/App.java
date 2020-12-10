package view;

import controller.IO;
import controller.OrderManager;
import controller.ProductManager;
import model.Order;
import model.OrderDetail;
import model.Product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

    public static ArrayList<Product> PRODUCTS = new ArrayList<Product>();
    public static void setListProducts(ArrayList<Product> listProduct) {
        App.PRODUCTS = listProduct;
    }
    public static ArrayList<Product> getListProducts() {
        return PRODUCTS;
    }





    public static ArrayList<Order> ORDERS = new ArrayList<Order>();
    public static void setListOrders(ArrayList<Order> ListOrder){
        App.ORDERS = ListOrder;
    }
    public static ArrayList<OrderDetail> ORDERDETAILS = new ArrayList<OrderDetail>();

    public static void menu(){
        System.out.println("------Danh sách chức năng-----");
        System.out.println("1. Thêm mới sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Mua hàng");
        System.out.println("6. Hiển thị danh sách đơn hàng");
        System.out.println("7. Thoát.");
    }


    public static void main(String[] args) {
        App.setListProducts(IO.readData());

        int function = 0;

        do {
            menu();
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("chọn chức năng");
                function = sc.nextInt();
                ProductManager productManager = new ProductManager();
                OrderManager orderManager = new OrderManager();
                switch (function){
                    case 1:
                        productManager.insert();
                        break;
                    case 2:
                        productManager.show();
                        break;
                    case 3:
                        productManager.update();
                        break;
                    case 4:
                        productManager.delete();
                        break;
                    case 5:
                        orderManager.order();
                        break;
                    case 6:
                        orderManager.show();
                        break;
                }
            } catch (InputMismatchException em){
                System.out.println("Vui lòng chọn lại chức năng:");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (function != 7);
        System.out.println("Thoát chương trình");
    }

//this comment

}
