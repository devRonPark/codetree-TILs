import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 과목의 개수: n
        int n = sc.nextInt();
        // 변수 선언
        double[] subjects = new double[n];
        double sum = 0;
        // 배열에 실수를 입력받아 저장
        for (int i = 0; i < n; i++) {
            subjects[i] = sc.nextDouble();
        }
        // 배열에 있는 실수들의 합 계산
        for (int i = 0; i < n; i++) {
            sum += subjects[i];
        }
        // 평균 계산
        double avg = sum / n;
        // 출력
        String avgStr = String.format("%.1f", avg);
        System.out.println(avgStr);
        if (avg >= 4.0) {
            System.out.println("Perfect");
        }
        else if (avg >= 3.0) {
            System.out.println("Good");
        }
        else {
            System.out.println("Poor");

        }
    }
}