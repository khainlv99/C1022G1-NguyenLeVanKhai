package ss3_mang_phuongthuc.bai_tap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang:");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("nhập giá trị của phần tử cho hàng "+ (i+1) + " cột " + (j+1));
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}
