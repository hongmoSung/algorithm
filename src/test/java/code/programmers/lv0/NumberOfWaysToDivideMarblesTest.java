package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfWaysToDivideMarblesTest {

    private final NumberOfWaysToDivideMarbles numberOfWaysToDivideMarbles = new NumberOfWaysToDivideMarbles();

    /**
     * <table>
     *     <tr>
     *         <td>balls</td>
     *         <td>share</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>3</td>
     *         <td>2</td>
     *         <td>3</td>
     *     </tr>
     *     <tr>
     *         <td>5</td>
     *         <td>3</td>
     *         <td>10</td>
     *     </tr>
     * </table>
     */
    @Test
    void numberOfWaysToDivideMarblesTest() {
        assertThat(numberOfWaysToDivideMarbles.solution(3, 2)).isEqualTo(3);
        assertThat(numberOfWaysToDivideMarbles.solution(5, 3)).isEqualTo(10);
    }
}