import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (
                (i % 2 == 0 && i % 4 != 0) || // 짝수이면서 4의 배수가 아닌 경우
                ((i / 8) % 2 == 0) || // 8로 나눈 몫이 짝수인 경우
                ((i % 7) < 4) // 7로 나눈 나머지가 4보다 작은 경우
            ) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}