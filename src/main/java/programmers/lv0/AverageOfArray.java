package programmers.lv0;

public class AverageOfArray {

    public double solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / (double)numbers.length;
    }
}
