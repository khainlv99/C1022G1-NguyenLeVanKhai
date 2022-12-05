package ss3_mang_phuongthuc.thuc_hanh;

import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        int arr[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập độ dài của mảng ");
        int size = scanner.nextInt();
        arr = new int[size];
        for(int i=0; i<arr.length;i++){
            System.out.println("Nhập số phần tử có trong mảng [" +(i+1)+"] :");
            arr[i] = scanner.nextInt();
        }
    }
}
