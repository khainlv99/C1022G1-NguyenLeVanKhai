package ss1_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Mời bạn nhập số: ");
        int number = scanner.nextInt();
        String ketQua = null;
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    ketQua = "zero";
                    break;
                case 1:
                    ketQua = "one";
                    break;
                case 2:
                    ketQua = "two";
                    break;
                case 3:
                    ketQua = "three";
                    break;
                case 4:
                    ketQua = "four";
                    break;
                case 5:
                    ketQua = "five";
                    break;
                case 6:
                    ketQua = "six";
                    break;
                case 7:
                    ketQua = "seven";
                    break;
                case 8:
                    ketQua = "eigth";
                    break;
                case 9:
                    ketQua = "nine";
                    break;
                default:
                    System.out.print("out of ability");
                    break;
            }
            if (!ketQua.equals("")) {
                System.out.printf("%s", ketQua);
            } else {
                System.out.print("out of ability");
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    ketQua = "ten";
                    break;
                case 11:
                    ketQua = "eleven";
                    break;
                case 12:
                    ketQua = "twelve";
                    break;
                case 13:
                    ketQua = "thirteen";
                    break;
                case 14:
                    ketQua = "fourteen";
                    break;
                case 15:
                    ketQua = "fifteen";
                    break;
                case 16:
                    ketQua = "sixteen";
                    break;
                case 17:
                    ketQua = "seventeen";
                    break;
                case 18:
                    ketQua = "eighteen";
                    break;
                case 19:
                    ketQua = "nineteen";
                    break;
            }
            if (!ketQua.equals("")) {
                System.out.printf("%s", ketQua);
            } else {
                System.out.print("out of ability");
            }
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % (tens * 10);
            String temp;
            switch (tens) {
                case 2:
                    ketQua = "twenty";
                    break;
                case 3:
                    ketQua = "thirty";
                    break;
                case 4:
                    ketQua = "fourty";
                    break;
                case 5:
                    ketQua = "fifty";
                    break;
                case 6:
                    ketQua = "sixty";
                    break;
                case 7:
                    ketQua = "seventy";
                    break;
                case 8:
                    ketQua = "eighty";
                    break;
                case 9:
                    ketQua = "ninety";
                    break;
            }
            temp = ketQua;
            switch (ones) {
                case 1:
                    ketQua = "one";
                    break;
                case 2:
                    ketQua = "two";
                    break;
                case 3:
                    ketQua = "three";
                    break;
                case 4:
                    ketQua = "four";
                    break;
                case 5:
                    ketQua = "five";
                    break;
                case 6:
                    ketQua = "six";
                    break;
                case 7:
                    ketQua = "seven";
                    break;
                case 8:
                    ketQua = "eigth";
                    break;
                case 9:
                    ketQua = "nine";
                    break;
                default:
                    ketQua = "";
                    break;
            }
            System.out.printf(temp + " %s", ketQua);
        } else if (number < 1000) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % (hundreds * 100 + tens * 10);
            String temp;
            switch (hundreds) {
                case 1:
                    ketQua = "one hundred";
                    break;
                case 2:
                    ketQua = "two hundred";
                    break;
                case 3:
                    ketQua = "three hundred";
                    break;
                case 4:
                    ketQua = "four hundred";
                    break;
                case 5:
                    ketQua = "five hundred";
                    break;
                case 6:
                    ketQua = "six hundred";
                    break;
                case 7:
                    ketQua = "seven hundred";
                    break;
                case 8:
                    ketQua = "eight hundred";
                    break;
                case 9:
                    ketQua = "nine hundred";
                    break;
            }
            temp = ketQua;
            switch (tens) {
                case 2:
                    ketQua = "twenty";
                    break;
                case 3:
                    ketQua = "thirty";
                    break;
                case 4:
                    ketQua = "fourty";
                    break;
                case 5:
                    ketQua = "fifty";
                    break;
                case 6:
                    ketQua = "sixty";
                    break;
                case 7:
                    ketQua = "seventy";
                    break;
                case 8:
                    ketQua = "eighty";
                    break;
                case 9:
                    ketQua = "ninety";
                    break;
            }
            if (tens > 1) {
                temp += ketQua;
                switch (ones) {
                    case 1:
                        ketQua = "one";
                        break;
                    case 2:
                        ketQua = "two";
                        break;
                    case 3:
                        ketQua = "three";
                        break;
                    case 4:
                        ketQua = "four";
                        break;
                    case 5:
                        ketQua = "five";
                        break;
                    case 6:
                        ketQua = "six";
                        break;
                    case 7:
                        ketQua = "seven";
                        break;
                    case 8:
                        ketQua = "eigth";
                        break;
                    case 9:
                        ketQua = "nine";
                        break;
                    default:
                        ketQua = "";
                        break;
                }
                System.out.printf(temp + " %s", ketQua);
            } else if (tens == 1) {
                switch (ones) {
                    case 1:
                        ketQua = "eleven";
                        break;
                    case 2:
                        ketQua = "twelve";
                        break;
                    case 3:
                        ketQua = "thirteen";
                        break;
                    case 4:
                        ketQua = "fourteen";
                        break;
                    case 5:
                        ketQua = "fifteen";
                        break;
                    case 6:
                        ketQua = "sixteen";
                        break;
                    case 7:
                        ketQua = "seventeen";
                        break;
                    case 8:
                        ketQua = "eighteen";
                        break;
                    case 9:
                        ketQua = "nineteen";
                        break;
                    default:
                        ketQua = "";
                        break;
                }
                System.out.printf(temp + "%s", ketQua);
            } else if (tens == 0) {
                switch (ones) {
                    case 1:
                        ketQua = "one";
                        break;
                    case 2:
                        ketQua = "two";
                        break;
                    case 3:
                        ketQua = "three";
                        break;
                    case 4:
                        ketQua = "four";
                        break;
                    case 5:
                        ketQua = "five";
                        break;
                    case 6:
                        ketQua = "six";
                        break;
                    case 7:
                        ketQua = "seven";
                        break;
                    case 8:
                        ketQua = "eigth";
                        break;
                    case 9:
                        ketQua = "nine";
                        break;
                    default:
                        ketQua = "";
                }
                System.out.printf(temp + "%s", ketQua);
            }
        }
    }
}
