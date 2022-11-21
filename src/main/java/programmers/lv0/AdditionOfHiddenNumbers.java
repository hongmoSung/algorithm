package programmers.lv0;

import java.util.Arrays;

/**
 * 문자열 my_string 이 매개변수로 주어집니다.
 * my_string 안의 모든 자연수들의 합을 return 하도록 solution 함수를 완성해주세요.
 */
public class AdditionOfHiddenNumbers {

    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-zA-Z]", "").split(""))
                .mapToInt(Integer::valueOf).sum();
    }
}
