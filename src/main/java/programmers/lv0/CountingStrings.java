package programmers.lv0;

import java.util.Arrays;

/**
 * my_string 은 "3 + 5"처럼 문자열로 된 수식입니다.
 * 문자열 my_string 이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 */
public class CountingStrings {

    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "")
                .trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }

}
