import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sumOfOddIdx = 0, sumOfEvenIdx = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (i % 2 == 0) {
                sumOfOddIdx += arr[i];
            }
            else if (i % 2 == 1) {
                sumOfEvenIdx += arr[i];
            }
        }

        if (sumOfOddIdx > sumOfEvenIdx) {
            System.out.println(sumOfOddIdx - sumOfEvenIdx);
        }
        else {
            System.out.println(sumOfEvenIdx - sumOfOddIdx);
        }
    }
}