package code.programmers.lv0;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
 * 문자열 numbers 가 매개변수로 주어질 때, numbers 를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
 */
public class HateEnglish {

    public long solution(String numbers) {
        Map<String, String> alphabets = Stream.of(new Object[][]{
                {"zero", "0"},
                {"one", "1"},
                {"two", "2"},
                {"three", "3"},
                {"four", "4"},
                {"five", "5"},
                {"six", "6"},
                {"seven", "7"},
                {"eight", "8"},
                {"nine", "9"}
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (String) data[1]));
        for (String s : alphabets.keySet()) {
            if (numbers.contains(s)) {
                numbers = numbers.replaceAll(s, alphabets.get(s));
            }
        }
        return Long.parseLong(numbers);
    }
}
