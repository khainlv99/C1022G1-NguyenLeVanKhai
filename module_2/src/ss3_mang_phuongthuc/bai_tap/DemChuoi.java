package ss3_mang_phuongthuc.bai_tap;

import java.util.Scanner;

public class DemChuoi {
    public static void main(String[] args) {
        String str = "khainguyenlevan";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự: ");
        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
