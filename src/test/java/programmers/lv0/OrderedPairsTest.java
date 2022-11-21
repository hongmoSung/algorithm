package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderedPairsTest {

    private final OrderedPairs orderedPairs = new OrderedPairs();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>20</td>
     *         <td>6</td>
     *     </tr>
     *     <tr>
     *         <td>100</td>
     *         <td>9</td>
     *     </tr>
     * </table>
     */
    @Test
    void orderedPairsTest() {
        assertThat(orderedPairs.solution(20)).isEqualTo(6);
        assertThat(orderedPairs.solution(100)).isEqualTo(9);
    }

}