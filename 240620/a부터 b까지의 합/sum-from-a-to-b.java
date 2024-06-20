import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a, b, sumVal = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        // a ~ b 까지 합 구하기
        for (int i = a; i <= b; i++) {
            sumVal += i;
        }
        System.out.print(sumVal);
    }
}