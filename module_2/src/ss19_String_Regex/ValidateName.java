package ss19_String_Regex;

import java.util.Scanner;

public class ValidateName {
    public static final String REGEX_NAME = "^[CAP]+\\d{4}+[G-M]$";

    public static boolean checkName(String nameClass) {
        return nameClass.matches(REGEX_NAME);
    }

    public static void main(String[] args) {
        System.out.print("Enter your class name : ");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        if (checkName(className)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
