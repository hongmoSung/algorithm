package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MakeMaxTest {

    private final MakeMax makeMax = new MakeMax();

    /**
     * <table>
     *     <tr>
     *         <td>numbers</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3, 4, 5]</td>
     *         <td>20</td>
     *     </tr>
     *     <tr>
     *         <td>[0, 31, 24, 10, 1, 9]</td>
     *         <td>744</td>
     *     </tr>
     * </table>
     */
    @Test
    void makeMaxTest() {
        assertThat(makeMax.solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(20);
        assertThat(makeMax.solution(new int[]{0, 31, 24, 10, 1, 9})).isEqualTo(744);
    }

}