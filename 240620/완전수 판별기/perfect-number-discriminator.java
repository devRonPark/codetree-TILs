import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n, sumVal = 0;
        n = sc.nextInt();

        // 1 ~ n-1 까지의 수 중에서 약수를 찾는다.
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumVal += i;
            }
        }

        if (n == sumVal) {
            System.out.print("P");
        } else {
            System.out.print("N");
        }
    }
}