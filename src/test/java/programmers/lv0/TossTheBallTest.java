package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TossTheBallTest {

    private final TossTheBall tossTheBall = new TossTheBall();

    /**
     * <table>
     *     <tr>
     *         <td>numbers</td>
     *         <td>k</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3, 4]</td>
     *         <td>2</td>
     *         <td>3</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3, 4, 5, 6]</td>
     *         <td>5</td>
     *         <td>3</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3]</td>
     *         <td>3</td>
     *         <td>2</td>
     *     </tr>
     * </table>
     */
    @Test
    void tossTheBallTest() {
        assertThat(tossTheBall.solution(new int[]{1, 2, 3, 4}, 2)).isEqualTo(3);
        assertThat(tossTheBall.solution(new int[]{1, 2, 3, 4, 5, 6}, 5)).isEqualTo(3);
        assertThat(tossTheBall.solution(new int[]{1, 2, 3}, 3)).isEqualTo(2);
    }

}