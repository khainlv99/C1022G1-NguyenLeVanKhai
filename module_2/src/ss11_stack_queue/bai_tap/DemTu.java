package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemTu {
    public static void main(String[] args) {
        Map<String, Integer> mWord = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        String word = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
                if (i == (str.length() - 1)) {
                    if (mWord.containsKey(word)) {
                        mWord.put(word, mWord.get(word) + 1);
                    } else {
                        mWord.put(word, 1);
                    }
                }
            } else {
                if (mWord.containsKey(word)) {
                    mWord.put(word, mWord.get(word) + 1);
                    word = "";
                } else {
                    mWord.put(word, 1);
                    word = "";
                }
                word = "";
            }
        }
        Set<String> keySet = mWord.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + mWord.get(key));
        }
    }
}
