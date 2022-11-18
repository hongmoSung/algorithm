package programmers.lv0;

import java.util.stream.IntStream;

/**
 * 정수 n이 주어질 때, n 이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 */
public class SumOfEvenNumbers {

    public int solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
    }
}
