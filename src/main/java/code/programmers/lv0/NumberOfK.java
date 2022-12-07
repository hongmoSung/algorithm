package code.programmers.lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <p>1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.</p>
 * <p>정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class NumberOfK {

    public int solution(int i, int j, int k) {
        String sumString = IntStream.rangeClosed(i, j).mapToObj(String::valueOf).collect(Collectors.joining());
        return Long.valueOf(sumString.chars().mapToObj(Character::toString)
                .filter(number -> number.equals(Integer.toString(k))).count()).intValue();
    }
}
