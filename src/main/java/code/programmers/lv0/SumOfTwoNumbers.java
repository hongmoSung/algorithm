package code.programmers.lv0;

public class SumOfTwoNumbers {

    /**
     * 정수 num1과 num2가 주어질 때,
     * num1과 num2의 합을 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution(int num1, int num2) {
        return (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) ? num1 + num2 : -1;
    }
}
