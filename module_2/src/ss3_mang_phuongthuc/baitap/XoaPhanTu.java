package ss3_mang_phuongthuc.baitap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17};
        int x;
        int index= -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value need delete: ");
        x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                index = i;
                break;
            }
        }
        for (int j = index; j < arr.length-1 ; j++) {
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = 0;
        for (int array: arr)
        {
            System.out.print(array+ ", ");
        }
    }
}
