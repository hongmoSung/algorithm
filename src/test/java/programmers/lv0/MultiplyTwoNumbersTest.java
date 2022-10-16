package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplyTwoNumbersTest {

    private final MultiplyTwoNumbers multiplyTwoNumbers = new MultiplyTwoNumbers();

    @Test
    void multiplyTwoNumbersTest() {
        int result1 = multiplyTwoNumbers.solution(3, 4);
        int result2 = multiplyTwoNumbers.solution(27, 19);
        int result3 = multiplyTwoNumbers.solution(27, 101);
        int result4 = multiplyTwoNumbers.solution(-1, 101);
        assertThat(result1).isEqualTo(12);
        assertThat(result2).isEqualTo(513);
        assertThat(result3).isEqualTo(0);
        assertThat(result4).isEqualTo(0);
    }

}