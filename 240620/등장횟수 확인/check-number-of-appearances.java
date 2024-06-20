import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n, i;
        int cntOfEven = 0; // 짝수 등장 횟수

        // 5개의 숫자 입력에 대해,
        for (i = 1; i <= 5; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                cntOfEven++;
            }
        }
        System.out.print(cntOfEven);
    }
}