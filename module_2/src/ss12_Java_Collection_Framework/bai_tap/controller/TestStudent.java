package ss12_Java_Collection_Framework.bai_tap.controller;

import ss12_Java_Collection_Framework.bai_tap.model.model.Product;
import ss12_Java_Collection_Framework.bai_tap.model.service.ProductManager;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        do {
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần\n"+
                    "7.Sắp xếp sản phẩm giảm dần\n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productManager.them();
                    break;
                case 2:
                    productManager.suaID();
                    break;
                case 3:
                    productManager.xoaID();
                    break;
                case 4:
                    productManager.hienThi();
                    break;
                case 5:
                    productManager.timKiem();
                case 6:
                    productManager.sapXepTangDan();
                    break;
                case 7:
                    productManager.sapXepGiamDan();
                    break;
            }
        } while (choice < 8);
    }
}
