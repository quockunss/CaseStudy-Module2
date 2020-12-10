package model;

public class Product {
    private Integer id;
    private String name;
    private Integer quantity;
    private String desc;
    private Float price;

    public Product(Integer id,String name,Integer quantity,String desc,Float price){
        this.id = id ;
        this.name = name;
        this.quantity = quantity;
        this.desc = desc;
        this.price = price;
    }

    public Product(String name,Integer quantity,String desc,Float price){
        this.name = name;
        this.quantity = quantity;
        this.desc = desc;
        this.price = price;
    }

    public Product(){}

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public float getQuantity() {
        return quantity;
    }
    public String getDesc() {
        return desc;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
