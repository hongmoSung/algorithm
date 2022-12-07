package code.programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <p>문자열 my_string 이 매개변수로 주어집니다. my_string 에서</p>
 * <p>중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class RemoveDuplicateCharacters {

    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).distinct()
                .map(String::valueOf).collect(Collectors.joining());
    }

}
