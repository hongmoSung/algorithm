package programmers.lv0;

/**
 * <p>문자열 str1, str2가 매개변수로 주어집니다.</p>
 * <p>str1 안에 str2가 있다면 1을 없다면 2를 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class StringInString {

    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
