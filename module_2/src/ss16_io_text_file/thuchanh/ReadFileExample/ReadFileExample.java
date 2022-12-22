package ss16_io_text_file.thuchanh.ReadFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();

            }
            BufferedReader buff = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            buff.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
