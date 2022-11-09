package programmers.lv0;

/**
 * <p>머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.</p>
 * <p>피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,</p>
 * <p>n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면</p>
 * <p>최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class SharePizza2 {

    public int solution(int n) {
        return LCM(n) / 6;
    }

    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }

    private int LCM(int num1) {
        return num1 * 6 / GCD(num1, 6);
    }
}
