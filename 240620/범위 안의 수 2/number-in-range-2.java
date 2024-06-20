import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int iptNum, sumVal = 0, cnt = 0;
        double avgVal = 0;

        for (int i = 1; i <= 10; i++) {
            iptNum = sc.nextInt();

            if (iptNum >= 0 && iptNum <= 200) {
                sumVal += iptNum;
                cnt++;
            }
        }
        avgVal = (double) sumVal / cnt;
        String avgValStr = String.format("%.1f", avgVal);

        System.out.print(sumVal + " " + avgValStr);
    }
}