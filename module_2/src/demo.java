import java.util.*;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i < 5; i = i + 2) {
            stack.add(i);
        }
        for (int i = 1; i < 8; i = i + 3) {
            queue.add(i);
        }

        int x, count = 0;
        while (!queue.isEmpty()) {
            if (stack.peek() <= queue.peek()) {
                x = queue.poll();
                stack.push(x);
            } else {
                x = stack.pop();
                queue.add(x);
                count++;
            }
        }

        System.out.println(count);
    }
}
