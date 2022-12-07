package code.programmers.lv0;

import java.math.BigInteger;

/**
 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
 * 머쓱이가 갖고 있는 구슬의 개수 balls 와 친구들에게 나누어 줄 구슬 개수 share 이 매개변수로 주어질 때,
 * balls 개의 구슬 중 share 개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
 */
public class NumberOfWaysToDivideMarbles {

    public BigInteger solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
    }

    private BigInteger factorial(int n) {
        BigInteger fac = BigInteger.valueOf(1);
        int i = 1;

        while (i <= n) {
            fac = fac.multiply(BigInteger.valueOf(i));
            i++;
        }
        return fac;
    }
}
