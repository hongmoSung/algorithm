package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfEvenNumbersTest {

    private final SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>10</td>
     *         <td>30</td>
     *     </tr>
     *     <tr>
     *         <td>4</td>
     *         <td>6</td>
     *     </tr>
     * </table>
     */
    @Test
    void sumOfEvenNumbersTest() {
        assertThat(sumOfEvenNumbers.solution(10)).isEqualTo(30);
        assertThat(sumOfEvenNumbers.solution(4)).isEqualTo(6);
    }

}