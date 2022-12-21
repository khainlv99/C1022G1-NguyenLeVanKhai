package ss15_debug;

import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao a : ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao b : ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao c : ");
        c = Integer.parseInt(scanner.nextLine());
        try {
            IllegalTriangleException.checkingTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
