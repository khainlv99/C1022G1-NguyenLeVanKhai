package ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.repository;

import ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(001, "Iphone11", "Apple", 13000000, "Tốt"));
        products.add(new Product(002, "Iphone12", "Apple", 14000000, "Tốt"));
        products.add(new Product(003, "Iphone13", "Apple", 15000000, "Tốt"));
        products.add(new Product(004, "Iphone14", "Apple", 16000000, "Tốt"));
        products.add(new Product(005, "Iphone15", "Apple", 17000000, "Tốt"));
        writeFile(products);
    }

    private static void writeFile(List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\USER\\Documents\\CodeGym\\C1022G1-NguyenLeVanKhai\\module_2\\src\\ss17_IO_BinaryFile_Serialization1\\bai_tap\\mvc\\test.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add() {
        Product product = new Product();
        int code;
        String name;
        String manufacturer;
        int price;
        String describe;
        System.out.print("Nhập vào code : ");
        Scanner scanner = new Scanner(System.in);
        code = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào tên sản phầm : ");
        name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất : ");
        manufacturer = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm : ");
        price = scanner.nextInt();
        System.out.println("Nhập các mô tả khác: ");
        describe = scanner.nextLine();
        product.setCode(code);
        product.setName(name);
        product.setManufacturer(manufacturer);
        product.setPrice(price);
        product.setDescribe(describe);
        products.add(product);
        for (Product product1 : products) {
            System.out.println(product1);
        }
    }

    @Override
    public void display() {
        System.out.println("\nDanh sách sản phẩm : ");
        for (Product product1 : readFile("C:\\Users\\USER\\Documents\\CodeGym\\C1022G1-NguyenLeVanKhai\\module_2\\src\\ss17_IO_BinaryFile_Serialization1\\bai_tap\\mvc\\test.dat")) {
            System.out.println(product1);
        }
    }

    @Override
    public void seach() {

    }

    public static List<Product> readFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
