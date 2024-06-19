import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int midTermScore = sc.nextInt();
        int finalTermScore = sc.nextInt();

        if (midTermScore >= 90) {
            if (finalTermScore >= 95 && finalTermScore <= 100)
                System.out.println("100000");
            else if (finalTermScore >= 90)
                System.out.println("50000");
            else
                System.out.println("0");
        } else
            System.out.println("0");
    }
}