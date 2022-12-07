package code.programmers.lv0;

/**
 * <p>문자열 my_string 이 매개변수로 주어질 때,</p>
 * <p>대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class UppercaseAndLowercase {

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (char s : my_string.toCharArray()) {
            if (Character.isUpperCase(s)) {
                answer.append(String.valueOf(s).toLowerCase());
            } else {
                answer.append(String.valueOf(s).toUpperCase());
            }
        }
        return answer.toString();
    }
}
