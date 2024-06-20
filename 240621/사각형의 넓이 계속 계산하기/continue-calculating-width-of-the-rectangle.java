import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int w, h, area;
        char ch;
        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            ch = sc.next().charAt(0);
            // 사각형의 넓이
            area = w * h;

            System.out.println(area);

            if (ch == 'C') {
                break;
            }
        }
    }
}