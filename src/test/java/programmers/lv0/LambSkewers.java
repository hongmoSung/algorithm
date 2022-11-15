package programmers.lv0;

/**
 * <p>머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.</p>
 * <p>양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때,</p>
 * <p>양꼬치 n 인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class LambSkewers {

    public int solution(int n, int k) {
        int discount = k > 0 ? n / 10 : 0;
        return n * 12000 + (k - discount) * 2000;
    }
}
