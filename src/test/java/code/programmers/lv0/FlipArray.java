package code.programmers.lv0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>정수가 들어 있는 배열 num_list 가 매개변수로 주어집니다.</p>
 * <p>num_list 의 원소의 순서를 거꾸로 뒤집은 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class FlipArray {

    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
