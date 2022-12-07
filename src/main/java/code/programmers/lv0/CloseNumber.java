package code.programmers.lv0;

/**
 * 정수 배열 array 와 정수 n이 매개변수로 주어질 때,
 * array 에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class CloseNumber {

    public int solution(int[] array, int n) {
        int answer = array[0];
        for (int i : array) {
            answer = Math.abs(answer - n) > Math.abs(i - n) ? i : answer;
            if (Math.abs(answer - n) == Math.abs(i - n)) answer = Math.min(answer, i);
        }
        return answer;
    }
}
