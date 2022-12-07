package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConditionsForTriangleTest {

    private final ConditionsForTriangle conditionsForTriangle = new ConditionsForTriangle();

    /**
     * <table>
     *     <tr>
     *         <td>sides</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3]</td>
     *         <td>2</td>
     *     </tr>
     *     <tr>
     *         <td>[3, 6, 2]</td>
     *         <td>2</td>
     *     </tr>
     *     <tr>
     *         <td>[199, 72, 222]</td>
     *         <td>1</td>
     *     </tr>
     * </table>
     */
    @Test
    void conditionsForTriangleTest() {
        assertThat(conditionsForTriangle.solution(new int[]{1, 2, 3})).isEqualTo(2);
        assertThat(conditionsForTriangle.solution(new int[]{3, 6, 2})).isEqualTo(2);
        assertThat(conditionsForTriangle.solution(new int[]{199, 72, 222})).isEqualTo(1);
    }

}