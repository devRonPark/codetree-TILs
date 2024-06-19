import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 2월 => 28일, 짝수 달에 30일, 홀수 달에 31일
        if (n == 2) {
            System.out.println("28");
        } else if (n % 2 == 0) {
            System.out.println("30");
        } else {
            System.out.println("31");
        }
    }
}