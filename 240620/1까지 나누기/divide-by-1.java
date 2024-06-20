import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, i = 1, cnt = 0;
        n = sc.nextInt();

        while (n > 1) {
            n /= i;
            i++;
            cnt++;
        }
        System.out.print(cnt);
    }
}