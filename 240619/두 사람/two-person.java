import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int ageOf1 = sc.nextInt();
        String genderOf1 = sc.next();
        int ageOf2 = sc.nextInt();
        String genderOf2 = sc.next();

        // equals() : 문자열의 내용이 같은지 비교
        // == : 문자열의 참조값(주소값)이 같은지 비교
        if (
            (ageOf1 >= 19 && genderOf1.equals("M"))
            ||
            (ageOf2 >= 19 && genderOf2.equals("M"))
        ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}