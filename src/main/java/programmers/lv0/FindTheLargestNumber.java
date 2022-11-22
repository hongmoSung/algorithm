package programmers.lv0;

import java.util.stream.IntStream;

/**
 * <p>정수 배열 array 가 매개변수로 주어질 때,</p>
 * <p>가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class FindTheLargestNumber {

    public int[] solution(int[] array) {
        int maxInt = IntStream.of(array).max().orElse(0);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxInt) index = i;
        }
        return new int[]{maxInt, index};
    }
}
