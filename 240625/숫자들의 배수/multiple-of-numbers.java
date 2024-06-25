import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[101];
        int cntMultipleOf5 = 0;

        for (int i = 1; i <= 100; i++) {
            arr[i] = n * i;
        }

        for (int i = 1; i <= 100; i++) {
            System.out.print(arr[i] + " ");
            
            if (arr[i] % 5 == 0) {
                cntMultipleOf5++;
            }

            if (cntMultipleOf5 == 2) {
                break;
            }
        }
    }
}