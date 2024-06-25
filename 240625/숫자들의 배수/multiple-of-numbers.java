import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 5번째와 10번째는 분명 5의 배수이므로, 10번 안에 항상 종료
        int[] arr = new int[10];
        int cntMultipleOf5 = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = n * (i+1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            
            if (arr[i] % 5 == 0) {
                cntMultipleOf5++;
            }

            if (cntMultipleOf5 >= 2) {
                break;
            }
        }
    }
}