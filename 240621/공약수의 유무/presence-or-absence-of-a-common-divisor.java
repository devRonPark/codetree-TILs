import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            // 1920 과 2880 을 나눌 수 있는 정수가 하나라도 존재하면, 
            if (1920 % i == 0 && 2880 % i == 0) {
                satisfied = true;
                break;
            }
        }

        if (satisfied == true) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}