package code.programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <p>PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.</p>
 * <p>알파벳이 담긴 배열 spell 과 외계어 사전 dic 이 매개변수로 주어집니다.</p>
 * <p>spell 에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic 에 존재한다면 1,</p>
 * <p>존재하지 않는다면 2를 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class AlienDictionary {

    public int solution(String[] spell, String[] dic) {
        String sortedSpell = Arrays.stream(spell).sorted().collect(Collectors.joining());
        boolean result = Arrays.stream(dic).anyMatch(s -> {
            String sortedString = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
            return sortedString.contains(sortedSpell);
        });
        return result ? 1: 2;
    }
}
