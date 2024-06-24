import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        // n: 2
        // i
        // 0 -> 1
        // 1 -> 1개 증가
        // 2 -> 1개 감소

        // n: 3
        // i
        // 0 -> 1
        // 1 -> 1개 증가
        // 2 -> 1개 증가
        // 3 -> 1개 감소
        // 4 -> 1개 감소

        for (int i = 0; i < n*2-1; i++) {
            for (int j = 0; j < cnt; j++) {
                System.out.print("* ");
            }
            System.out.println();

            // i 조건에 따라 cnt 증감 결정
            if (i < n-1) {
                cnt++;
            } 
            else {
                cnt--;
            }
        }
    }
}