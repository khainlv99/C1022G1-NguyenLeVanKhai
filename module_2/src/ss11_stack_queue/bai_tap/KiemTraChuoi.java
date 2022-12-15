package ss11_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraChuoi {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine().toLowerCase();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            queue.offer(str.charAt(i) + "");
            stack.push(str.charAt(i) + "");
        }
        boolean kiemTra = true;
        for (int i = 0; i < length; i++) {
            String queue1 = queue.poll();
            String stack1 = stack.pop();
            if (!queue1.equals(stack1)) {
                kiemTra = false;
            }
        }
        if (kiemTra) {
            System.out.println("Là chuỗi palindrome");
        } else {
            System.out.println("Không phải là chuỗi palindrome");
        }
    }
}
