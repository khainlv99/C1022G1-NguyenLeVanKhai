package ss2_vonglap.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần kiểm tra: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println("Số đó không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean flag = true;
            while (i < number) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag) {
                System.out.println("Số đó là số nguyên tố");
            }else {
                System.out.println("Số đó không phải là số nguyên tố");
            }
        }
    }
}
