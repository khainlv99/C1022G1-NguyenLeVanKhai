package ss4_lop_doituong.bai_tap.phuongtrinhbac2;
import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta: " + delta);
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("Nghiệm 1 :" + quadraticEquation.getRoot1());
            System.out.println("Nghiệm 2 : " + quadraticEquation.getRoot2());
        } else if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Phương trình có nghiệm kép: " + quadraticEquation.getRoot2());
        }
    }
}
