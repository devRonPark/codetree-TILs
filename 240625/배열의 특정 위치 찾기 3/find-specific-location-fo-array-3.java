import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        // 처음으로 주어진 0의 인덱스 번호
        int idxOfFirst0 = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                idxOfFirst0 = i;
                break;
            }
        }

        // 처음으로 주어진 0의 인덱스 앞번호 3개에 위치한 값의 합
        int sum = 0;
        for (int i = idxOfFirst0 - 1; i >= idxOfFirst0 - 3; i--) {
            sum += arr[i];
        }

        System.out.print(sum);

    }
}