package ss12_Java_Collection_Framework.bai_tap.model.repository;

import ss12_Java_Collection_Framework.bai_tap.model.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository{
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Khải", 1000000000));
        products.add(new Product(2, "NyKhải", 2000000000));
        products.add(new Product(3, "NycKhải", -1));
    }

    @Override
    public void them() {
        Product product = new Product();
        int id;
        String name;
        int price;
        System.out.print("Nhập vào id : ");
        Scanner scanner = new Scanner(System.in);
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào tên sản phầm : ");
        name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm : ");
        price = scanner.nextInt();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        products.add(product);
        for (Product product1 : products) {
            System.out.println(product1);
        }
    }

    @Override
    public void suaID(Product product) {
        for (int i = 0; i < products.size() ; i++) {
            if(products.get(i).getId() == product.getId()){
                products.set(i,product);
                break;
            }
        }
    }

    @Override
    public Product timKiem(int id) {
        for (Product c: products) {
            if (c.getId()==id){
                return c;
            }
        }
        return null;
    }

    @Override
    public void xoaID() {
        int id;
        System.out.print("Nhập vào id sản phẩm bạn muốn xóa : ");
        Scanner scanner = new Scanner(System.in);
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                products.remove(products.get(i));
            }
        }
    }
    @Override
    public void hienThi() {
        System.out.println("\nDanh sách sản phẩm : ");
        for (Product product1 : products) {
            System.out.println(product1);
        }
    }

    @Override
    public void timKiem() {
        String name;
        System.out.print("Nhập vào tên sản phẩm bạn muốn tìm : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println("Thông tin sản phẩm : " + product);
            }
        }
    }

    @Override
    public void sapXepTangDan() {
        System.out.println("\nSắp xếp tăng dần sản phẩm theo giá : ");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public void sapXepGiamDan() {
        System.out.println("\nSắp xếp giảm dần sản phẩm theo giá : ");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
