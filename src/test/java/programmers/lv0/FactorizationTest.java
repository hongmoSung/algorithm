package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorizationTest {

    private final Factorization factorization = new Factorization();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>12</td>
     *         <td>[2, 3]</td>
     *     </tr>
     *     <tr>
     *         <td>17</td>
     *         <td>[17]</td>
     *     </tr>
     *     <tr>
     *         <td>420</td>
     *         <td>[2, 3, 5, 7]</td>
     *     </tr>
     * </table>
     */
    @Test
    void factorizationTest() {
        assertThat(factorization.solution(12)).isEqualTo(new int[]{2, 3});
        assertThat(factorization.solution(17)).isEqualTo(new int[]{17});
        assertThat(factorization.solution(420)).isEqualTo(new int[]{2, 3, 5, 7});
    }
}