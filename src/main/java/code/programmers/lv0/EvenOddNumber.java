package code.programmers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <p>정수가 담긴 리스트 num_list 가 주어질 때,</p>
 * <p>num_list 의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class EvenOddNumber {

    public int[] solution(int[] num_list) {
        return IntStream.of(
                (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(),
                (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count()).toArray();
    }
}
