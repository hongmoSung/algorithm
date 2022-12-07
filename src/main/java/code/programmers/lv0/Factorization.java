package code.programmers.lv0;

import java.util.stream.IntStream;

/**
 * <p>소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.</p>
 * <p>예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다.</p>
 * <p>자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return 하도록 solution 함수를 완성해주세요.</p>
 */
public class Factorization {

    public int[] solution(int n) {
        return IntStream.rangeClosed(2, n).filter(i -> n % i == 0 && primeNumber(i)).distinct().toArray();
    }

    private boolean primeNumber(int number) {
        if (number < 2) return false;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
