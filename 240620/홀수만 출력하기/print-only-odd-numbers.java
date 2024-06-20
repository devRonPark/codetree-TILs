import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, i, intNum;
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            intNum = sc.nextInt();

            if (intNum % 2 == 1 && intNum % 3 == 0) {
                System.out.println(intNum);
            }
        }
    }
}