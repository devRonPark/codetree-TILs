import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 배열 및 합 선언
        int[] arr = new int[100];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            // 합 계산 조건(3, 5, 10번째 정수)
            if (i == 2 || i == 4 || i == 9) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}