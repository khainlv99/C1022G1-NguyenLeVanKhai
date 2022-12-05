package ss3_mang_phuongthuc.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập giá trị của mảng 1: ");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập giá trị của mảng 2: ");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[(arr1.length) + i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ",");
        }
    }
}
