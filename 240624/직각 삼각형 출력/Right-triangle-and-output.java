import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // i: 출력할 라인의 개수
        // j: 반복 출력할 별 문자열의 개수
        for (int i = 0; i < n; i++) {
            // 
            for (int j = 0; j < (2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}