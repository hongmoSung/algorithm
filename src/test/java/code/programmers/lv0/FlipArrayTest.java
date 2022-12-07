package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlipArrayTest {

    private final FlipArray flipArray = new FlipArray();

    /**
     * <table>
     *     <tr>
     *         <td>num_list</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3, 4, 5]</td>
     *         <td>[5, 4, 3, 2, 1]</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 1, 1, 1, 1, 2]</td>
     *         <td>[2, 1, 1, 1, 1, 1]</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 0, 1, 1, 1, 3, 5]</td>
     *         <td>[5, 3, 1, 1, 1, 0, 1]</td>
     *     </tr>
     * </table>
     */
    @Test
    void flipArrayTest() {
        assertThat(flipArray.solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{5, 4, 3, 2, 1});
        assertThat(flipArray.solution(new int[]{1, 1, 1, 1, 1, 2})).isEqualTo(new int[]{2, 1, 1, 1, 1, 1});
        assertThat(flipArray.solution(new int[]{1, 0, 1, 1, 1, 3, 5})).isEqualTo(new int[]{5, 3, 1, 1, 1, 0, 1});
    }

}