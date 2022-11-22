package programmers.lv0;

import java.util.HashMap;

/**
 * <p>가위는 2 바위는 0 보는 5로 표현합니다.</p>
 * <p>가위 바위 보를 내는 순서대로 나타낸 문자열 rsp 가 매개변수로 주어질 때,</p>
 * <p>rsp 에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class RockPaperScissors {

    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        String[] inputs = rsp.split("");
        HashMap<String, String> answerMap = new HashMap<>();
        answerMap.put("2", "0");
        answerMap.put("0", "5");
        answerMap.put("5", "2");

        for (String input : inputs) {
            answer.append(answerMap.get(input));
        }

        return answer.toString();
    }
}
