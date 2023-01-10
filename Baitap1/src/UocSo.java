import java.util.Scanner;

public class UocSo {
    public static void main(String[] args) {
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n<=5000){
            for (int i =2;i<=n;i++){
                if(n%i==0&&i%2==0){
                    sum += i;
                }
            }
            System.out.println(sum);
        }else {
            System.out.println("Nhập vượt n");
        }
    }
}
