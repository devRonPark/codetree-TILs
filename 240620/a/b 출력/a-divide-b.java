import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        // 정수 부분 먼저 출력
        System.out.print((a/b) + ".");

        // 소수점 자리를 하나씩 계산
        // ((a%b)*10) / b 의 반복
        a %= b;
        for (int i = 0; i < 20; i++) {
            a *= 10;
            System.out.print(a / b);

            a %= b;
        }
    }
}