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

        int urgentPatients = 0;

        if (aHasCold.equals("Y") && aTemperature >= 37) {
            urgentPatients++;
        }
        if (bHasCold.equals("Y") && bTemperature >= 37) {
            urgentPatients++;
        }
        if (cHasCold.equals("Y") && cTemperature >= 37) {
            urgentPatients++;
        }

        if (urgentPatients >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}