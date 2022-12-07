package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareNumberTest {

    private final SquareNumber squareNumber = new SquareNumber();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>144</td>
     *         <td>1</td>
     *     </tr>
     *     <tr>
     *         <td>976</td>
     *         <td>2</td>
     *     </tr>
     * </table>
     */
    @Test
    void squareNumberTest() {
        assertThat(squareNumber.solution(144)).isEqualTo(1);
        assertThat(squareNumber.solution(976)).isEqualTo(2);
    }

}