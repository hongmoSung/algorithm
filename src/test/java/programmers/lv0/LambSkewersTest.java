package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LambSkewersTest {

    private final LambSkewers lambSkewers = new LambSkewers();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>k</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>10</td>
     *         <td>3</td>
     *         <td>124,000</td>
     *     </tr>
     *     <tr>
     *         <td>64</td>
     *         <td>6</td>
     *         <td>768,000</td>
     *     </tr>
     * </table>
     */
    @Test
    void lambSkewersTest() {
        assertThat(lambSkewers.solution(10, 3)).isEqualTo(124000);
        assertThat(lambSkewers.solution(64, 6)).isEqualTo(768000);
    }

}