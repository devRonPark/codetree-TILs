import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 행이 증가함에 따라 공백의 개수가 어떻게 변하는지 파악
            // 공백을 해당 개수만큼 출력
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }
            // 행이 증가함에 따라 별의 개수가 어떻게 변하는지 파악
            // 별을 해당 개수만큼 출력
            for (int j = 0; j < (2*n - 2*i -1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}