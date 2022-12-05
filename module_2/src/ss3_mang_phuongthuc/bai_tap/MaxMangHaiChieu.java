package ss3_mang_phuongthuc.bai_tap;

import java.util.Scanner;

public class MaxMangHaiChieu {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of row: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter size of col");
        col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter value for element of row "+ (i+1) + " col " + (j+1) +" : ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = arr[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max ) {
                    max = arr[i][j];
                    indexRow=i;
                    indexCol=j;
                }
            }
        }
        System.out.println("Số lớn nhất là: "+ max );
        System.out.println("Hàng chỉ mục:  "+indexRow );
        System.out.println("Cột chỉ mục:  "+indexCol );
    }
}
