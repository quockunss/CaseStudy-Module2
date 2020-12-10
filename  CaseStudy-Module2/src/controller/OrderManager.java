package controller;

import model.Order;
import model.OrderDetail;
import model.Product;
import view.App;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderManager {

    Scanner sc = new Scanner(System.in);
    public void order(){
        System.out.println("-----Mua hàng-----");
        try {
            System.out.println("Mã đặt hàng: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nhập tên khách hàng: ");
            String customername = sc.nextLine();

            System.out.println("Nhập số điện thoại khách hàng: ");
            String phone = sc.nextLine();


            System.out.println("Nhập địa chỉ khách hàng: ");
            String address = sc.nextLine();

            Order order = new Order(id,customername,phone,address);
            int productId = -1;

            do{
                System.out.println("Nhập mã sản phẩm: ");
                productId = sc.nextInt();

                System.out.println("Nhập số lượng: ");
                int quantity = sc.nextInt();

                Product product = null;

                for (Product p : App.PRODUCTS){
                    if(p.getId() == productId){
                        product = p;
                        break;
                    }
                }
                if (product == null){
                    System.out.println("Mã sản phẩm không tồn tại");
                }

                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setId(1);
                orderDetail.setOrderId(order.getId());
                orderDetail.setPrice((float) product.getPrice());
                orderDetail.setProductId(productId);
                orderDetail.setQuantity(quantity);

                order.getOrderDetails().add(orderDetail);

            } while (productId == 0);
            App.ORDERS.add(order);
        } catch (InputMismatchException em){
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void show(){
        System.out.println("Danh sách đặt hàng");
        String header = String.format("%s%15s%30s%30s", "Mã","Tên khách hàng","Số điện thoại","Địa chỉ");
        System.out.println(header);
        ProductManager productManager = new ProductManager();


        for(Order order : App.ORDERS){
            String infor = String.format("%s%15s%30s%30s", order.getId(),order.getCustomerName(),order.getPhone(),order.getAddress());
            System.out.println(infor);
            String orderDetailHeader = String.format("%s%15s%30s%30s", "STT","Tên sản phẩm","Giá","Số lượng");
            System.out.println(orderDetailHeader);

            int i = 1;
            for (OrderDetail od : order.getOrderDetails()){

                Product p = ProductManager.getById(od.getProductId());

                String orderDetailInfor = String.format("%s%15s%30s%30s", i,p.getName(),od.getPrice(),od.getQuantity());
                System.out.println(orderDetailInfor);
                i++;
        }
    }
    }


}
