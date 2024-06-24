import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        // n: 4, line 개수: 13
        // n: 5, line 개수: 17
        // line: 4n - 3
        // 총 (4n - 3) 줄에 걸쳐 별표 출력
        for (int i = 0; i < 4*n-3; i++) {
            // 라인 별 조건에 따라 
            // 별표 출력 혹은 공백 라인 출력
            if (i % 2 == 0) {
                for (int j = 0; j < cnt; j++) {
                    System.out.print("*");
                }
                System.out.println();
                
                // 라인 별 조건에 따른 별표 증감
                // n = 4일 때 i = 0, 2, 4일 때 별표 증가
                // n = 5일 때 i = 0, 2, 4, 6일 때 별표 증가
                if (i < 2*n-3) {
                    cnt++;
                }
                else {
                    cnt--;
                }
            }
            else {
                System.out.println();
            }
        }
    }
}