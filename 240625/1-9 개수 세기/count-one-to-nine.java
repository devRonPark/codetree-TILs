import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 원소 수 n 입력받기
        int n = sc.nextInt();
        int[] countArr = new int[10];
        int[] arr = new int[n];

        // 배열에 입력받은 정수 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 카운팅 배열을 통해 각각의 빈도 저장
        for (int i = 0; i < n; i++) {
            countArr[arr[i]]++;
        }

        // 1부터 9까지 나온 횟수 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println(countArr[i]);
        }
    }
}