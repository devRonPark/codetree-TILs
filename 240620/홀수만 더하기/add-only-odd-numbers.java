import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, iptNum, i, sumVal = 0;
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            iptNum = sc.nextInt();
            // 홀수 && 3의 배수인 경우,
            if (iptNum % 2 == 1 && iptNum % 3 == 0) {
                sumVal += iptNum;
            }
        }

        System.out.print(sumVal);
    }
}