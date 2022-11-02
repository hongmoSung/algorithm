package programmers.lv0;

public class NumberOfDuplicates {
    /**
     * 정수가 담긴 배열 array 와 정수 n이 매개변수로 주어질 때, array 에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) if (i == n) answer++;
        return answer;
    }
}
