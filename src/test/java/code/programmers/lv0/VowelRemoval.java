package code.programmers.lv0;

/**
 * <p>영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.</p>
 * <p>문자열 my_string 이 매개변수로 주어질 때 모음을 제거한 문자열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class VowelRemoval {

    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
