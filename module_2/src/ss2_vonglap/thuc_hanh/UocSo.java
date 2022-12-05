package ss2_vonglap.thuc_hanh;

import java.util.Scanner;

public class UocSo {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Mời bạn nhập số b: ");
        b = scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0){
            System.out.println("No greatest common factor");
        }
        while (a!=b){
            if (a>b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
