package programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>정수가 담긴 배열 numbers 와 문자열 direction 가 매개변수로 주어집니다.</p>
 * <p>배열 numbers 의 원소를 direction 방향으로 한 칸씩 회전시킨 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class RotateTheArray {

    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
