import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int numCnt, iptNum, sumVal = 0;
        double avgVal;
        numCnt = sc.nextInt();

        for (int i = 1; i <= numCnt; i++) {
            iptNum = sc.nextInt();

            sumVal += iptNum;
        }
        avgVal = (double) sumVal / numCnt;
        String avgValStr = String.format("%.1f", avgVal);

        System.out.print(sumVal + " " + avgValStr);
    }
}