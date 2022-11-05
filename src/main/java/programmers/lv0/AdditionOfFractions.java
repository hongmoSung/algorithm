package programmers.lv0;

/**
 * <p>첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1,</p>
 * <p>두 번째 분수의 분자와 분모를 뜻하는 denum2, num2 가 매개변수로 주어집니다.</p>
 * <p>두 분수를 더한 값을 기약 분수로 나타냈을 때</p>
 * <p>분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class AdditionOfFractions {

    /**
     * <p>1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.</p>
     */
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int a = (denum1 * num2) + (denum2 * num1);
        int b = num1 * num2;
        int gcd = gcd(a, b);
        answer[0] = a / gcd;
        answer[1] = b / gcd;
        return answer;
    }

    /**
     * <a href="https://ko.wikipedia.org/wiki/유클리드_호제법">유클리드_호제법</a>
     */
    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return this.gcd(b, a % b);
    }
}
