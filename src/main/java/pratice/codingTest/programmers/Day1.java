package pratice.codingTest.programmers;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Day1 {
    /**
     * 자릿수 더하기
     * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
     * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
     */
    public int solution1_1(int n) {
        int answer = 0;

        String nArr[] = Integer.toString(n).split("");
        for(String num : nArr) {
            answer += Integer.parseInt(num);
        }

        return answer;
    }

    public int solution1_2(int n) {
        int answer = 0;

        while (n>=1) {
            answer += n%10;
            n=n/10;
        }

        return answer;
    }

    /**
     * 평균 구하기
     * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
     */
    public double solution2_1(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }
        answer = answer/arr.length;

        return answer;
    }

    public double solution2_2(int[] arr) {
        double answer = 0;

        answer = (double) Arrays.stream(arr).average().orElse(0);

        return answer;
    }

}
