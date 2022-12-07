package ss4_lop_doituong.thuc_hanh;

import java.util.Scanner;

public class RunHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        int chieuDai = scanner.nextInt();
        System.out.print("Enter the height:");
        int chieuRong = scanner.nextInt();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println("Your Rectangle \n"+ hinhChuNhat.hienThi());
        System.out.println("Perimeter of the Rectangle: "+ hinhChuNhat.getChuVi());
        System.out.println("Area of the Rectangle: "+ hinhChuNhat.getDienTich());
    }
}
