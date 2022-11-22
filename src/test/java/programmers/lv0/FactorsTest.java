package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorsTest {

    private final Factors factors = new Factors();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>24</td>
     *         <td>[1, 2, 3, 4, 6, 8, 12, 24]</td>
     *     </tr>
     *     <tr>
     *         <td>29</td>
     *         <td>[1, 29]</td>
     *     </tr>
     * </table>
     */
    @Test
    void factorsTest() {
        assertThat(factors.solution(24)).isEqualTo(new int[]{1, 2, 3, 4, 6, 8, 12, 24});
        assertThat(factors.solution(29)).isEqualTo(new int[]{1, 29});
    }

}