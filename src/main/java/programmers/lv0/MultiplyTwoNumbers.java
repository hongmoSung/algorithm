package programmers.lv0;

/**
 * <p>정수 num1, num2가 매개변수 주어집니다.</p>
 * <p>num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.</p>
 * <p>제한사항</p>
 * <p>0 ≤ num1 ≤ 100</p>
 * <p>0 ≤ num2 ≤ 100</p>
 */
public class MultiplyTwoNumbers {

    public int solution(int num1, int num2) {
        return (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) ? num1 * num2 : 0;
    }
}
