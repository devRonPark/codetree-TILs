import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, prodVal = 1;
        n = sc.nextInt();

        for (int i = 1; i<= 10; i++) {
            prodVal *= i;
            if (prodVal >= n) {
                System.out.print(i);
                break;
            }
        }
    }
}