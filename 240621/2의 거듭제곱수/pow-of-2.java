import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), x = 0;

        while (true) {
            if (N == 1) {
                break;
            }
            N /= 2;
            x++;
        }

        System.out.println(x);
    }
}