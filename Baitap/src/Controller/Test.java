package Controller;

import Model.service.CongNhanService;
import Model.service.ICongNhanService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ICongNhanService iCongNhanService = new CongNhanService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------Menu------------------\n" +
                "1. Hiển thị danh sách công nhân\n" +
                "2. Thêm mới 1 công nhân \n" +
                "3. Tìm kiếm nhân viên\n" +
                "4. Exit");
        do {
            System.out.println("Mời bạn nhập choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iCongNhanService.display();
                    break;
                case 2:
                    iCongNhanService.add();
                    break;
                case 3:
                    iCongNhanService.search();
                    break;
                default:
                    System.exit(-1);
            }
        }while (true);

    }


}
