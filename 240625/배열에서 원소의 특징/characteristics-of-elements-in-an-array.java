import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        // 3의 배수가 처음으로 등장하는 인덱스 번호
        int k = 0;

        // 배열에 입력받은 정수 삽입
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 3 == 0) {
                k = i;
                break;
            }
        }

        System.out.println(arr[k - 1]);
    }
}