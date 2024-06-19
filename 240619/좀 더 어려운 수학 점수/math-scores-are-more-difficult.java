import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 입력
        int mathScoreOfA = sc.nextInt();
        int engScoreOfA = sc.nextInt();
        int mathScoreOfB = sc.nextInt();
        int engScoreOfB = sc.nextInt();
        // 출력
        if (mathScoreOfA > mathScoreOfB) {
            System.out.println("A");
        } else if (mathScoreOfA == mathScoreOfB) {
            if (engScoreOfA > engScoreOfB) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else {
            System.out.println("B");
        }
    }
}