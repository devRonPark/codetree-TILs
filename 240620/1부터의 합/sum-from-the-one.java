import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, sumVal = 0;
        n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            sumVal += i;
            if (sumVal >= n) {
                System.out.print(i);
                break;
            }
        }
    }
}