package code.programmers.lv0;

import java.util.Arrays;

/**
 * <p>정수 배열 numbers 와 정수 num1, num2가 매개변수로 주어질 때,</p>
 * <p>numbers 의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class CutArray {

    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
