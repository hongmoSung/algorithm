package programmers.lv0;

import java.util.Arrays;

/**
 * <p>정수 n과 정수 배열 numlist 가 매개변수로 주어질 때,</p>
 * <p>numlist 에서 n의 배수가 아닌 수들을 제거한 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class PickAMultipleOfN {

    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(number -> number % n == 0).toArray();
    }
}
