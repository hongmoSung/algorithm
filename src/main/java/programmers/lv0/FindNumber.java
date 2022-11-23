package programmers.lv0;

/**
 * <p>정수 num 과 k가 매개변수로 주어질 때, num 을 이루는 숫자 중에 k가 있으면</p>
 * <p>num 의 그 숫자가 있는 자리 수를 return 하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class FindNumber {

    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }
}
