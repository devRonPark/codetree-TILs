import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // a 가 중앙값인 경우 :
        if (a <= b && a >= c || a <= c && a >= b) {
            System.out.println(a);
        }
        // b 가 중앙값인 경우 :
        else if (b <= a && b >= c || b <= c && b >= c) {
            System.out.println(b);
        } 
        else {
            System.out.println(c);
        }
    }
}