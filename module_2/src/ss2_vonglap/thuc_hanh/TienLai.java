package ss2_vonglap.thuchanh;

import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        double soTien = 1.0;
        int soThang = 1;
        double laiSuat = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền cần gửi: ");
        soTien = scanner.nextDouble();
        System.out.println("Mời bạn tỉ lệ lãi suất tháng: ");
        laiSuat = scanner.nextDouble();
        System.out.println("Mời bạn nhập tháng: ");
        soThang = scanner.nextInt();
        double totalInterest = 0;
        for(int i = 0; i < soThang; i++){
            totalInterest += soTien * (laiSuat/100)/12 * soThang;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
