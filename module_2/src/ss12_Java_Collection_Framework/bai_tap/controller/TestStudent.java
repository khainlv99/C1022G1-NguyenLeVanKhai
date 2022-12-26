package ss12_Java_Collection_Framework.bai_tap.controller;
import ss12_Java_Collection_Framework.bai_tap.model.model.Product;
import ss12_Java_Collection_Framework.bai_tap.model.service.IProductService;
import ss12_Java_Collection_Framework.bai_tap.model.service.ProductService;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IProductService productManager = new ProductService();
        int choice;
        do {
            System.out.println("-------Menu-------\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần\n"+
                    "7.Sắp xếp sản phẩm giảm dần\n" +
                    "8.Exit");
            System.out.println("Nhap choice: \n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productManager.them();
                    break;
                case 2:
                    System.out.println("Nhập id :");
                    int oldID = Integer.parseInt(sc.nextLine());
                    Product c = productManager.timKiem(oldID);
                    if(c!= null){
                        System.out.println("Nhập tên :");
                        String name = sc.nextLine();
                        System.out.println("Nhập giá :");
                        int price = Integer.parseInt(sc.nextLine());
                        c.setName(name);
                        c.setPrice(price);
                        productManager.suaID(c);
                    }
                    break;
                case 3:
                    productManager.xoaID();
                    break;
                case 4:
                    productManager.hienThi();
                    break;
                case 5:
                    productManager.timKiem();
                    break;
                case 6:
                    productManager.sapXepTangDan();
                    break;
                case 7:
                    productManager.sapXepGiamDan();
                    break;
                case 8:
                    System.exit(1);
            }
        } while (true);
    }
}
