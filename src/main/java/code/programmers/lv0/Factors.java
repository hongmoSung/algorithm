package code.programmers.lv0;

import java.util.stream.IntStream;

/**
 * <p>정수 n이 매개변수로 주어질 때,</p>
 * <p>n의 약수를 오름차순으로 담은 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class Factors {

    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
