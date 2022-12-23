package ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String manufacturer;
    private int price;
    private String describe;
    public static final long serialVersionUID = 2L;

    public Product() {
    }

    public Product(int code, String name, String manufacturer, int price, String describe) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.describe = describe;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", describe=" + describe +
                '}';
    }
}

