package programmers.lv0;

/**
 * <p>문자열 my_string 이 매개변수로 주어집니다.</p>
 * <p>my_string 을 거꾸로 뒤집은 문자열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class FlipString {

    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}
