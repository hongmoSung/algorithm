package code.programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
 * 정수 배열 array 가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 */
public class NumberOf7 {

    public int solution(int[] array) {
        long count = Arrays.stream(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining()).split(""))
                .filter(s -> s.equals("7")).count();
        return Long.valueOf(count).intValue();
    }
}
