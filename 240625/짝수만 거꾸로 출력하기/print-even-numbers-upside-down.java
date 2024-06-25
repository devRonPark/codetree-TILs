import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 정수의 개수 n 을 입력받는다.
        int n = sc.nextInt();

        // 배열 선언(n개의 정수는 100개 이하)
        int[] arr = new int[100];

        // 배열에 정수들을 차례로 추가
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열에 역순으로 접근해 짝수인 값만 출력
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}