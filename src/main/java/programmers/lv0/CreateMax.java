package programmers.lv0;

import java.util.Arrays;

/**
 * <p>정수 배열 numbers 가 매개변수로 주어집니다.</p>
 * <p>numbers 의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class CreateMax {

    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}
