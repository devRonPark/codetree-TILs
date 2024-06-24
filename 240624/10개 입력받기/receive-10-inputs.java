import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0, cnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                break;
            }
            sum += arr[i];
            cnt++;
        }
        double avg = (double) sum / cnt;
        String avgStr = String.format("%.1f", avg);

        System.out.print(sum + " " + avgStr);
    }
}