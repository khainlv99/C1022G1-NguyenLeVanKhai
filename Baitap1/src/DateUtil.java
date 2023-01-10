import java.text.DateFormat;
import java.time.DateTimeException;
import java.util.Scanner;

public class DateUtil {
    public String isValidDate(String ngay){
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            String thang;
            String nam;
            switch (choice){
                case 1:
                    thang = "1";
                    ngay = "30";
                    break;
                case 2:
                    thang = "2";
                    ngay = "30";
                    break;
                case 3:
                    thang = "3";
                    ngay = "30";
                    break;
                case 4:
                    thang = "4";
                    ngay = "30";
                    break;
                case 5:
                    thang = "1";
                    ngay = "30";
                    break;
                case 6:
                    thang = "1";
                    ngay = "30";
                    break;
                case 7:
                    thang = "1";
                    ngay = "30";
                    break;
                case 8:
                    thang = "1";
                    ngay = "30";
                    break;
                case 9:
                    thang = "1";
                    ngay = "30";
                    break;
                case 10:
                    thang = "1";
                    ngay = "30";
                    break;
                case 11:
                    thang = "1";
                    ngay = "30";
                    break;
                case 12:
                    thang = "1";
                    ngay = "30";
                    break;
            }
        }while (true);
    }
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String ngay = scanner.nextLine();

    }

}
