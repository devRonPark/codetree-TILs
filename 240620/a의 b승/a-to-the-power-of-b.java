import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, prod = 1;
        a = sc.nextInt();
        b = sc.nextInt();

        // 곱하기를 b 번 반복
        for (int i = 1; i <= b; i++) {
            prod *= a;
        }

        System.out.print(prod);
    }
}