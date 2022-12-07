package code.programmers.lv0;

import java.util.Arrays;

/**
 * <p>정수 배열 numbers 가 매개변수로 주어집니다.</p>
 * <p>numbers 의 각 원소에 두배한 원소를 가진 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class DoubleTheArray {

    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(value -> value * 2).toArray();
    }
}
