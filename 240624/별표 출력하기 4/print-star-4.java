import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 라인 별 출력할 별의 개수
        int cnt = n;
        // 총 (2n - 1) 개의 라인에 걸쳐 별표 출력
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < cnt; j++) {
                System.out.print("* ");
            }
            System.out.println();

            // 라인 증가에 따른 별의 개수 증감 조건 
            if (i < (n - 1)) {
                cnt--;
            } 
            else {
                cnt++;
            }
        }
    }
}