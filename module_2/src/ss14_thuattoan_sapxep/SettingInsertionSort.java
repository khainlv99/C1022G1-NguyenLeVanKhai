package ss14_thuattoan_sapxep;

import java.util.Arrays;
import java.util.Scanner;

public class SettingInsertionSort {
    public void insertionSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int  currentElement = list[i];
            int k;
            for (k = i-1; k >=0 && list[k]>currentElement;k--) {
                list[k+1] = list[k];
            }
            list[k+1]= currentElement;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử cho mảng: ");
            arr[i] = scanner.nextInt();
        }
        SettingInsertionSort settingInsertionSort = new SettingInsertionSort();
        settingInsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
