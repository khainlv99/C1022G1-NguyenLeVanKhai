package ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.controller;

import ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.model.Product;
import ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.service.IProductService;
import ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.service.ProductService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        int choice;
        do {
            System.out.println("-------Menu-------\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Tìm kiếm sản phẫm\n" +
                    "3.Hiển thị sản phẫm\n" +
                    "4.Exit");
            System.out.println("Nhap choice: \n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.seach();
                    break;
                case 3:
                    iProductService.display();
                    break;
                case 4:
                    System.exit(1);
            }
        }while (true);
    }
}
