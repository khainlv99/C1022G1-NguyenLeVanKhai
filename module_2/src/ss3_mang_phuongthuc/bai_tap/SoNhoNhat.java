package ss3_mang_phuongthuc.bai_tap;

import java.util.Scanner;

public class SoNhoNhat {
    public static void main(String[] args) {
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập phần tử có trong mảng  " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất là : " + min);
    }
}
