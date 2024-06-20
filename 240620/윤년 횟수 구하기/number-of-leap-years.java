import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        int n, i;
        n = sc.nextInt();
        int cntOfLeapYear = 0;

        for (i = 1; i <= n; i++) {
            // if (i % 4 == 0) {
            //     if (i % 100 == 0) {
            //         if (i % 400 == 0) {
            //             // 윤년
            //             cntOfLeapYear++;
            //         } else {
            //             // 평년
            //         }
            //     } else {
            //         // 윤년
            //         cntOfLeapYear++;
            //     }
            // }

            if (
                (i % 4 == 0 && i % 100 == 0 && i % 400 == 0) ||
                (i % 4 == 0 && i % 100 != 0)
            ) {
                cntOfLeapYear++;
            }
        }

        System.out.print(cntOfLeapYear);
    }
}