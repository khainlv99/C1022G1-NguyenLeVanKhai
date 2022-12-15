package ss11_stack_queue.bai_tap.dao_nguoc;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu cho mang: ");
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
