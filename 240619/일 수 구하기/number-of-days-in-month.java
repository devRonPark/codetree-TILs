import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 7보다 작거나 같은 경우 : 홀수달은 31일, 짝수달은 30일
        // 7보다 큰 경우 : 홀수달은 30일, 짝수달은 31일
        if (n == 2) {
            System.out.println("28");
        } else {
            if ((n <= 7 && n % 2 == 1) || (n > 7 && n % 2 == 0)) {
                System.out.println("31");
            } else {
                System.out.println("30");
            }
        }
    }
}