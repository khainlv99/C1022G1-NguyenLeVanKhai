package ss11_stack_queue.bai_tap.dao_nguoc;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu cho mang: ");
        String mWord = scanner.nextLine();
        for (int i = 0; i < mWord.length() ; i++) {
            wStack.push(mWord.charAt(i)+"");
        }
        System.out.println(wStack);
        String outp = new String("Khai");
        for (int i = 0; i < mWord.length(); i++) {
            outp += wStack.pop();
            outp += "";
        }
        System.out.println(outp);
    }
}
