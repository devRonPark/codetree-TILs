import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, i;
        int cntMultipledBy3 = 0;
        int cntMultipledBy5 = 0;

        for (i = 1; i <= 10; i++) {
            n = sc.nextInt();

            if (n % 3 == 0) {
                cntMultipledBy3++;
            }
            
            if (n % 5 == 0) {
                cntMultipledBy5++;
            }
        }
        System.out.print(cntMultipledBy3 + " " + cntMultipledBy5);
    }
}