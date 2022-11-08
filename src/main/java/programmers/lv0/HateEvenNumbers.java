package programmers.lv0;

import java.util.stream.IntStream;

/**
 * <p>정수 n이 매개변수로 주어질 때,</p>
 * <p>n 이하의 홀수가 오름차순으로 담긴 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */

public class HateEvenNumbers {

    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

}