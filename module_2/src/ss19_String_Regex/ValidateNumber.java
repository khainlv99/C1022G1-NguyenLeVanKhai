package ss19_String_Regex;

import java.util.Scanner;

public class ValidateNumber {
    public static final String REGEX_NAME = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static boolean checkNumber(String numberClass){
        return numberClass.matches(REGEX_NAME);
    }

    public static void main(String[] args) {
        System.out.println("Enter your class number: ");
        Scanner scanner = new Scanner(System.in);
        String classNumber = scanner.nextLine();
        if(checkNumber(classNumber)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
