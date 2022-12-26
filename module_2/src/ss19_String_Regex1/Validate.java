package ss19_String_Regex1;

import java.util.Scanner;

public class Validate {
    public static final String REGEX_NAME = "^[CAP]+\\d{4}+[G-M]$";

    public static boolean checkClass(String nameClass) {
        return nameClass.matches(REGEX_NAME);
    }


    public static void main(String[] args) {
        System.out.print("Enter your class name : ");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        if (checkClass(className)) {
            System.out.println(className);
            System.out.println("True");
        } else {
            System.out.println(className);
            System.out.println("False");
        }
    }
}
