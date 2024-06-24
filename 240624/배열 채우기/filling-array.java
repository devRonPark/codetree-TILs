import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 배열 선언
        int[] arr = new int[10];

        int cntToPrint = 10;
        // 정수 입력받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                cntToPrint = i;
                break;
            }
        }

        for (int i = cntToPrint-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}