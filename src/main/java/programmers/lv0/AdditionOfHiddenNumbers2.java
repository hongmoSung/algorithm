package programmers.lv0;

import java.util.Arrays;

/**
 * <p>문자열 my_string 이 매개변수로 주어집니다. my_string 은 소문자, 대문자, 자연수로만 구성되어있습니다.</p>
 * <p>my_string 안의 자연수들의 합을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class AdditionOfHiddenNumbers2 {

    public int solution(String my_string) {
        return Arrays.stream(my_string.split("[a-zA-Z]"))
                .filter(s -> !s.isEmpty()).mapToInt(Integer::valueOf).sum();
    }
}
