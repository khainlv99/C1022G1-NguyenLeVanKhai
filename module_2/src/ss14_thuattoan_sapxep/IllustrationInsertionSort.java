package ss14_thuattoan_sapxep;

import java.util.Arrays;

public class IllustrationInsertionSort {
    public static void sapXepChen(int[] array) {
        for (int i=1 ; i<array.length ; i++) {
            int minValue = array[i];
            int minIndex = i;
            while (minIndex > 0 && minValue < array[minIndex-1]) {
                array[minIndex] = array[minIndex-1];
                minIndex--;
                System.out.println(Arrays.toString(array));
            }
            array[minIndex] = minValue;
        }
    }
    public static void main(String[] args) {
        int[] arrayInteger = {1,8,4,6,19,21,13,14,77};
        IllustrationInsertionSort.sapXepChen(arrayInteger);
        for (Integer i : arrayInteger) {
            System.out.print(i + "   ");
        }
    }
}
