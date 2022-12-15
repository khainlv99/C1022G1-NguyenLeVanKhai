package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number>0){
            int number1 = number % 2;
            stack.push(number1);
            number = number/2;
        }
        int length = stack.size();
        for (int i = 0; i < length ; i++) {
            System.out.println(stack.pop());
        }
    }
}
