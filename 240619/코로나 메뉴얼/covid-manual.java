import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String aHasCold = sc.next();
        int aTemperature = sc.nextInt();
        String bHasCold = sc.next();
        int bTemperature = sc.nextInt();
        String cHasCold = sc.next();
        int cTemperature = sc.nextInt();

        // 첫 번째 환자가 A 인 경우와 아닌 경우로 분기
        // 첫 번째 환자가 A라면, 
        //     적어도 두 환자 중 한 명이 A여야 한다.
        // 첫 번째 환자가 A가 아니라면,
        //     두 환자 모두 A여야 한다.
        if (aHasCold.equals("Y") && aTemperature >= 37) {
            if (
                (bHasCold.equals("Y") && bTemperature >= 37) ||
                (cHasCold.equals("Y") && cTemperature >= 37)
            ) {
                System.out.println("E");
            } else {
                System.out.println("N");
            }
        } else {
            if (
                (bHasCold.equals("Y") && bTemperature >= 37) &&
                (cHasCold.equals("Y") && cTemperature >= 37)
            ) {
                System.out.println("E");
            } else {
                System.out.println("N");
            }
        }
    }
}