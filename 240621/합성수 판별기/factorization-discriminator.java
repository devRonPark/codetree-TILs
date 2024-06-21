import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean satisfied = false; // 합성수 여부 판단
        // 2부터 (n - 1)까지 주어진 입력값을 나누기
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // 하나라도 나누어 떨어지면 합성수
                satisfied = true;
                break;
            }
        }
        System.out.println(satisfied ? 'C' : 'N'); 
    
    }
}