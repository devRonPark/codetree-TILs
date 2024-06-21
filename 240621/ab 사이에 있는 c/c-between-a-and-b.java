import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean satisfied = false;
        
        for (int i = a; i <= b; i++) {
            // a~b 사이의 값 중 c의 배수가 있는지 확인
            if (i % c == 0) {
                satisfied = true;
                break;
            }
        }

        // 출력
        if (satisfied ==  true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}