import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), currNum;
        String evenNumsStr = "";
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            currNum = sc.nextInt();
            
            if (currNum % 2 == 0) {
                evenNumsStr = currNum + " " + evenNumsStr;
            }
        }

        System.out.println(evenNumsStr);
    }
}