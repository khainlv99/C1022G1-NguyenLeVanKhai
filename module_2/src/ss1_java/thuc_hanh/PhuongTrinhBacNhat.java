package ss1_java.thuchanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số c:");
        double c = Double.parseDouble(scanner.nextLine());
        if (a!= 0){
            double bacNhat = (c-b)/a;
            System.out.println("Kết quả là:"+bacNhat);
        }else if(b==a){
            System.out.println("The solution is all x!");
        }else {
            System.out.print("No solution!");
        }
    }
}
