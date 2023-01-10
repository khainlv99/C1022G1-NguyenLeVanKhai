package mvc.controller;

import mvc.model.service.INganHangService;
import mvc.model.service.NganHangService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        INganHangService iNganHangService = new NganHangService();
        System.out.println("1. Hiển thị danh sách sổ tiết kiệm\n" +
                "2. Đăng ký sổ tiết kiệm \n" +
                "3. Exit\n");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iNganHangService.display();
                    break;
                case 2:
                    iNganHangService.dangky();
                    break;
                case 3:
                    System.exit(-1);
            }
        }while (true);
    }
}
