package code.programmers.lv0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency 가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을
 * return 하도록 solution 함수를 완성해주세요.
 */
public class SetTheOrderOfTreatment {

    public int[] solution(int[] emergency) {
        return Arrays.stream(emergency).map(i -> Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}
