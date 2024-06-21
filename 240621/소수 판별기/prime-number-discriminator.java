import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean satisfied = true;

        for (int i = 2; i < n; i++) {
            // n이 1과 자기자신을 제외한 다른 수로 나눠 떨어지면,
            if (n % i == 0) {
                // 더 이상 소수가 아니다.
                satisfied = false;
                break;
            }
        }

        if (satisfied == true) {
            System.out.println("P");
        }
        else {
            System.out.println("C");
        }
    }
}