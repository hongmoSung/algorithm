package programmers.lv0;

import java.util.Arrays;

/**
 * <p>문자열 before 와 after 가 매개변수로 주어질 때,</p>
 * <p>before 의 순서를 바꾸어 after 를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class MakeBOutOfA {

    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return new String(beforeArr).equals(new String(afterArr)) ? 1 : 0;
    }
}
