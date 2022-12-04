package ss3_mang_phuongthuc.baitap;

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
        int[] arrNum3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrNum3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrNum3[(arr1.length) + i] = arr2[i];
        }
        for (int i = 0; i < arrNum3.length; i++) {
            System.out.print(arrNum3[i] + ", ");
        }
    }
}
