package ss1_java.bai_tap;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        usd=scanner.nextDouble();
        double vnd= usd* 23000;
        System.out.println("Giá trị VND: "+vnd);
    }
}
