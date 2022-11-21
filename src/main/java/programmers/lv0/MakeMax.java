package programmers.lv0;

import java.util.Arrays;
import java.util.Collections;

/**
 * <p>정수 배열 numbers 가 매개변수로 주어집니다.</p>
 * <p>numbers 의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class MakeMax {

    public int solution(int[] numbers) {
        return Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).limit(2)
                .reduce(1, (a, b) -> a * b);
    }
}
