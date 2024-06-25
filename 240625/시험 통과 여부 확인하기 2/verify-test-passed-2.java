import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cntOfPassed = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            double avg = (double) sum / 4;

            if (avg >= 60) {
                System.out.println("pass");
                cntOfPassed++;
            }
            else {
                System.out.println("fail");
            }
        }

        System.out.println(cntOfPassed);
    }
}