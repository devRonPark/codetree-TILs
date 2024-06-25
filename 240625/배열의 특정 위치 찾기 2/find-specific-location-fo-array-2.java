import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 변수 선언
        int[] arr = new int[10];

        int sumOfOddIdx = 0;
        int sumOfEvenIdx = 0;

        // 10개의 정수를 배열에 입력받아 저장.
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        // 홀수번째 수들의 합과 짝수번째 수들의 합 계산
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sumOfOddIdx += arr[i];
            }
            else {
                sumOfEvenIdx += arr[i];
            }
        }
        // 비교해 큰 쪽에서 작은 쪽을 뺍니다.
        if (sumOfOddIdx > sumOfEvenIdx) {
            System.out.println(sumOfOddIdx - sumOfEvenIdx);
        }
        else {
            System.out.println(sumOfEvenIdx - sumOfOddIdx);
        }
    }
}