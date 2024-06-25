import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        // 배열에 차례대로 입력받은 정수 저장
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            // 배열의 각 요소에 차례대로 접근
            // 즉시 종료 조건 : 요소가 0인 경우 break;
            // 요소가 홀수(% 2 == 1) -> 요소 + 3 출력
            // 요소가 짝수(% 2 == 0) -> 요소 / 2 출력 

            if (arr[i] == 0) {
                break;
            }

            if (arr[i] % 2 == 1) {
                System.out.print((arr[i] + 3) + " ");
            }
            else {
                System.out.print((arr[i] / 2) + " ");
            }
        }
    }
}