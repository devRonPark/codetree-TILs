import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0, cnt = 0;
        double avg;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            // 250 이상의 정수라면,
            if (arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            cnt++;
        }

        // 250 이상의 정수가 없다면, cnt 값은 주어진 정수의 개수와 동일
        if (cnt == 10) {
            avg = (double) sum / 10;
        }
        else {
            avg = (double) sum / cnt;
        }
        // 평균은 반올림하여 소수 첫째자리까지
        String avgStr = String.format("%.1f", avg);

        System.out.print(sum + " " + avgStr);
    }
}