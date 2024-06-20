import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);


        int a, b, sumVal = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        // Case 1. a가 더 큰 경우
        if (a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 5 == 0) {
                    sumVal += i;
                }
            }
        }
        // Case 2. b가 더 큰 경우 
        else {
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    sumVal += i;
                }
            }
        }

        System.out.print(sumVal);
    }
}