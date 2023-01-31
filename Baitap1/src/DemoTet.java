import java.util.Scanner;

public class DemoTet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so b: ");
        int b = Integer.parseInt(scanner.nextLine());
        int c = a + b;
        System.out.println("Ket qua la:" + c);
    }
}
