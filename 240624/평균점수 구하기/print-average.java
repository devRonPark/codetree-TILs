import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double[] grades = new double[8];
        double sum = 0;

        // 배열에 입력받은 실수 추가
        for (int i = 0; i < 8; i++) {
            grades[i] = sc.nextDouble();
        }
        // 배열의 실수들의 합 계산
        for (int i = 0; i < 8; i++) {
            sum += grades[i];
        }
        // 평균 계산
        double avg = sum / 8;
        // 출력
        System.out.printf("%.1f", avg);
    }
}