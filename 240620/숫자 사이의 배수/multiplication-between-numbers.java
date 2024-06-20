import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a, b, i, sumVal = 0, cnt = 0;
        double avgVal = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        for (i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sumVal += i;
                cnt++;
            }
        }
        avgVal = (double) sumVal / cnt;
        // 소수 첫째 자리까지 출력되는 실수 문자열
        String avgValStr = String.format("%.1f", avgVal);

        System.out.print(sumVal + " " + avgValStr);
    }
}