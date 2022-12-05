package ss1_java.baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = scanner.nextLine();
        System.out.println("Hello: "+ a);
    }
}
