import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, cnt = 0;
        while (true) {
            n = sc.nextInt();
            // 홀수라면 건너뜀.
            if (n % 2 == 1) {
                continue;
            }
            // 짝수라면
            System.out.println(n / 2);
            cnt++;
            // 3번까지만 
            if (cnt >= 3) {
                break;
            } 
        }
    }
}