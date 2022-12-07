package code.programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <p>영어 대소문자로 이루어진 문자열 my_string 이 매개변수로 주어질 때,</p>
 * <p>my_string 을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class SortingStringsTwo {

    public String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }
}
