package ss2_vonglap.bai_tap;

public class PrimeNumberTwenty {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(n + ", ");
                count++;
            }
            n++;
        }
    }
}
