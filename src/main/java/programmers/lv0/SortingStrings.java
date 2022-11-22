package programmers.lv0;

import java.util.Arrays;

/**
 * <p>문자열 my_string이 매개변수로 주어질 때,</p>
 * <p>my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.</p>
 */
public class SortingStrings {

    public int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-zA-Z]", "").split(""))
                .mapToInt(Integer::valueOf).sorted().toArray();
    }
}
