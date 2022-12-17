package ss12_Java_Collection_Framework.bai_tap.model.repository;

import ss12_Java_Collection_Framework.bai_tap.model.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository{
    List<Product> products = new ArrayList<>();
    Product product1 = new Product("1", "Khải", 1000000000);
    Product product2 = new Product("2", "NyKhải", 2000000000);
    Product product3 = new Product("3", "NycKhải", -1);

    {
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }


    @Override
    public void them() {
        Product product = new Product();
        String id;
        String name;
        int price;
        System.out.print("Nhập vào id : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
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
    public void suaID() {
        String id, name;
        int price;
        System.out.print("\nNhập vào id sản phẩm bạn muốn chỉnh sửa : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        System.out.print("Chỉnh sửa tên : ");
        name = scanner.nextLine();
        System.out.print("Chỉnh sửa giá : ");
        price = scanner.nextInt();
        Product editProduct = new Product(id, name, price);
        int n = 0;
        for (Product product1 : products) {
            if (product1.getId().equals(id)) {
                n = products.indexOf(product1);
            }
        }
        products.add(n, editProduct);
        products.remove(n + 1);
        for (Product product1 : products) {
            System.out.println(product1);
        }

    }

    @Override
    public void xoaID() {
        String id;
        System.out.print("Nhập vào id sản phẩm bạn muốn xóa : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        for (Product product1 : products) {
            if (product1.getId().equals(id)) {
                products.remove(product1);
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
            if (product.getName().equals(name)) {
                System.out.println("Thông tin sản phẩm : " + product);
            }
        }
        for (Product product1 : products) {
            System.out.println(product1);
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
