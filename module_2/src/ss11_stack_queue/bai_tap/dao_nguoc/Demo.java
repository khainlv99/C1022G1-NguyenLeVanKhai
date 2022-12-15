package ss11_stack_queue.bai_tap.dao_nguoc;

import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Nhập số: ");
        int number = Integer.parseInt(sc.nextLine());
        while (number > 0) {
            int surplus = number % 2;
            integerStack.push(surplus);
            number = number / 2;
        }
        int length = integerStack.size();
        for (int i = 0; i < length; i++) {
            System.out.print(integerStack.pop());
        }
    }
}
