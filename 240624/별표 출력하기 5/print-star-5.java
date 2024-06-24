import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // 라인 별 반복 출력할 별표 문자열 초기화
        String starStr = initStarStr(n);

        // n = 2
        // i = 0 일 때, '** ' 가 2번(n) 출력
        // i = 1 일 때, '* ' 가 1번(n-1) 출력
        for (int i = 0; i < n; i++) {
            // 각 라인 별 별표 문자열 출력 횟수 
            for (int j = 0; j < (n - i); j++) {
                System.out.print(starStr + " ");
            }
            // 각 문자열 당 1개의 별 문자열 제거
            starStr = removeLastStarChar(starStr);
            System.out.println();
        }
    }

    static String initStarStr(int n) {
        String starStr = "";
        for (int i = 0; i < n; i++) {
            starStr += "*";
        }
        return starStr;
    }

    static String removeLastStarChar(String str) {
        return str.replaceAll(".$", "");
    }
}