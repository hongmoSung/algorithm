package programmers.lv0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>문자열 my_string 과 정수 num1, num2가 매개변수로 주어질 때,</p>
 * <p>my_string 에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class ReplaceIndex {

    public String solution(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
