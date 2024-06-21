import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int currNum;
        boolean satisfied = true;

        for(int i = 0; i < 5; i++) {
            currNum = sc.nextInt();
            // 3의 배수가 아닌 수가 있다면,
            if (currNum % 3 != 0) {
                satisfied = false;
                break;
            }
        }

        if (satisfied == true) {
            System.out.println(1);
        } 
        else {
            System.out.println(0);
        }
    }
}