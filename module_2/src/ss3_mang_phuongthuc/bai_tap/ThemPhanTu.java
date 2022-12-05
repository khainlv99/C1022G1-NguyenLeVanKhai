package ss3_mang_phuongthuc.bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử bạn muốn thêm vào ");
        x = scanner.nextInt();
        int index;
        System.out.println("Nhập chỉ mục:");
        index = scanner.nextInt();
        if (index <= -1 || index >= arr.length) {
            System.out.println("không thể thêm phần tử");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            for (int array : arr) {
                System.out.print(array + ",");
            }
        }
    }
}
