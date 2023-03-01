package pratice.codingTest.programmers;

import java.util.*;

public class Day2 {
    /**
     * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
     */
    public int solution1_1() {
        int answer = 0;
        int n = 12;

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public int solution1_2() {
        int answer = 0;
        int n = 15;

        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0) {
                answer += i;
            }
        }

        return answer + n;
    }

    /**
     * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
     */

    public String solution2_1() {
        String answer = "";
        int num = 12;

        if(num % 2 == 0) {
            answer = "Even";
        }else {
            answer = "Odd";
        }

        return answer;
    }

    public String solution2_2() {
        String answer = "";
        int num = 12;

        answer = num % 2 == 0 ? "Even" : "Odd";

        return answer;
    }

    /**
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     */

    public int[] solution3_1() {
        long n = 12345;
        String answerStr = Long.toString(n);
        int[] answer = new int[answerStr.length()];

        for (int i = 0; i < answerStr.length(); i++) {
            answer[i] = Integer.parseInt(answerStr.substring(answerStr.length()-1-i, answerStr.length()-i));
        }

        return answer;
    }

    public int[] solution3_2() {
        long n = 12345;
        String answerStr = "" + n;
        int[] answer = new int[answerStr.length()];

        for (int i = 0; n>0; i++) {
            answer[i] = (int) (n%10);
            n/=10;
        }

        return answer;
    }

    /**
     * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
     * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
     * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
     */

    public boolean solution4_1() {
        boolean answer = true;
        String s= "pPoooyY";

        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals("P") || s.substring(i, i+1).equals("p")) {
                pCount++;
            }else if(s.substring(i, i+1).equals("Y") || s.substring(i, i+1).equals("y")) {
                yCount++;
            }
        }

        answer = pCount == yCount ? true : false;

        return answer;
    }

    public boolean solution4_2() {
        boolean answer = true;
        String s= "pPoooyY";

        s = s.toLowerCase();
        answer = s.chars().filter( e -> 'p'== e).count() == s.chars().filter( e -> 'y'== e).count();

        return answer;
    }

    /**
     * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
     * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
     */

    public long solution5_1() {
        long answer = 0;
        long n= 121;

        answer = Math.sqrt(n) == Math.floor(Math.sqrt(n)) ? (long) ((Math.floor(Math.sqrt(n)) + 1) * (Math.floor(Math.sqrt(n)) + 1)) : -1;

        return answer;
    }

    public long solution5_2() {
        long answer = -1;
        long n= 121;

        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return answer;
    }

}
