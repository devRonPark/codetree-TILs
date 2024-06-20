import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 사람들의 수, 나이 총합, 평균 저장하는 변수 필요
        int currentAge, peopleCnt = 0, ageSum = 0;
        double ageAvg;

        while (true) {
            currentAge = sc.nextInt();
            // 20대가 아닌 경우,
            if (currentAge / 10 != 2) {
                break;
            }
            
            ageSum += currentAge;
            peopleCnt++;
            
        } 
        ageAvg = (double) ageSum / peopleCnt;
        // 소수점 둘째자리까지 반올림한 실수 문자열 
        String ageAvgStr = String.format("%.2f", ageAvg);

        System.out.println(ageAvgStr);
    }
}