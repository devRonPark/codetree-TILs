import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 4의 배수라면 => 윤년
        // 4의 배수가 아니라면 => 평년
        // 100의 배수이면서 400의 배수가 아니라면 => 평년
    
        // 4의 배수 + 100의 배수가 아닌 경우 => 윤년
        // 4의 배수 + 100의 배수 + 400의 배수인 경우 => 윤년
        int n = sc.nextInt();

        // 입력값이 평년이라면
        // 2월 => 28일, 짝수 달에 30일, 홀수 달에 31일
        if (!((n % 4 == 0 && n % 100 == 0) || (n % 4 == 0 && n % 100 == 0 && n % 400 == 0))) {
            if (n == 2) {
                System.out.println("28");
            } else if (n % 2 == 0) {
                System.out.println("30");
            } else {
                System.out.println("31");
            }
        }
    }
}