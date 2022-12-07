package code.programmers.lv0;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * <p>문자열 my_str 과 n이 매개변수로 주어질 때, my_str 을 길이 n씩 잘라서</p>
 * <p>저장한 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class CutAndStoreAsArray {

    public String[] solution(String my_str, int n) {
        AtomicInteger count = new AtomicInteger();
        Collection<List<String>> myStrList = Arrays.stream(my_str.split(""))
                .collect(Collectors.groupingBy(s -> count.getAndIncrement() / n)).values();

        return myStrList.stream().map(l -> String.join("", l))
                .collect(Collectors.toList())
                .toArray(String[]::new);

    }
}
