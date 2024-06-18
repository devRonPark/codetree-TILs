import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        // 3, 4, 5 : Spring % 10 => 3, 4, 5
        // 6, 7, 8 : Summer % 10 => 6, 7, 8
        // 9, 10, 11 : Fall % 10 => 9, 10, 11
        // 12, 1, 2 : Winter % 10 => 1, 2
        if (month % 10 > 8)
            System.out.println("Fall");
        else if (month % 10 > 5)
            System.out.println("Summer");
        else if (month % 10 > 2)
            System.out.println("Spring");
        else
            System.out.println("Winter");
    }
}