import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, i; 
        n = sc.nextInt(); // 자연수

        for (i = 1; i <= n; i++) {
            if (
                i % 3 == 0 || // 3의 배수
                i % 10 == 3 || // 숫자에 3이 들어가거나
                i % 10 == 6 || // 숫자에 6이 들어가거나
                i % 10 == 9 // 숫자에 9가 들어가거나
            ) {
                System.out.print(0);
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }

        
    }
}