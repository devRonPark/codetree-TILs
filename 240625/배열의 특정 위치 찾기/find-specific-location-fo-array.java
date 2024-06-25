import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] arr = new int[100];
        // 각각 짝수 번째로 입력된 값, 3의 배수 번째로 입력된 값의 합
        int sumEvenIndex = 0, sumMultipleOf3Index = 0;
        // 3의 배수 번째로 입력된 값의 개수
        int cntMultipleOf3Index = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            // 짝수 번째로 입력된 값
            if (i % 2 == 1) {
                sumEvenIndex += arr[i];
            }

            // 3의 배수 번째로 입력된 값
            if (i % 3 == 2) {
                sumMultipleOf3Index += arr[i];
                cntMultipleOf3Index++;
            }
        }

        double avgMultipleOf3Index = (double) sumMultipleOf3Index / cntMultipleOf3Index;

        System.out.print(sumEvenIndex + " " + String.format("%.1f", avgMultipleOf3Index));
    }
}