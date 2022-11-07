package programmers.lv0;


import java.util.*;

/**
 * <p>최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array 가 매개변수로 주어질 때,</p>
 * <p>최빈값을 return 하도록 solution 함수를 완성해보세요.</p>
 * <p>최빈값이 여러 개면 -1을 return 합니다.</p>
 */
public class FrequencyValue {

    public int solution(int[] array) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int value : array) {
            frequency.putIfAbsent(value, 0);
            frequency.put(value, frequency.get(value) + 1);
        }

        List<Integer> frequencyMaxList = new ArrayList<>();

        int frequencyMax = Collections.max(frequency.values());

        frequency.forEach((key, value) -> {
            if (value == frequencyMax) frequencyMaxList.add(key);
        });

        return frequencyMaxList.size() > 1 ? -1 : frequencyMaxList.get(0);
    }

}
