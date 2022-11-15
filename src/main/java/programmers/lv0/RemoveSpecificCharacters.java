package programmers.lv0;

/**
 * <p>문자열 my_string 과 문자 letter 이 매개변수로 주어집니다.</p>
 * <p>my_string 에서 letter 를 제거한 문자열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class RemoveSpecificCharacters {

    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

}
