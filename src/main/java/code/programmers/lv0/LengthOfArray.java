package code.programmers.lv0;

import java.util.Arrays;

/**
 * <p>문자열 배열 strlist 가 매개변수로 주어집니다.</p>
 * <p>strlist 각 원소의 길이를 담은 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class LengthOfArray {

    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
