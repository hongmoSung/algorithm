package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfDiceTest {

    private final NumberOfDice numberOfDice = new NumberOfDice();

    /**
     * <table>
     *     <tr>
     *         <td>box</td>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 1, 1]</td>
     *         <td>1</td>
     *         <td>1</td>
     *     </tr>
     *     <tr>
     *         <td>[10, 8, 6]</td>
     *         <td>3</td>
     *         <td>12</td>
     *     </tr>
     * </table>
     */
    @Test
    void numberOfDiceTest() {
        assertThat(numberOfDice.solution(new int[]{1, 1, 1}, 1)).isEqualTo(1);
        assertThat(numberOfDice.solution(new int[]{10, 8, 6}, 3)).isEqualTo(12);

    }

}