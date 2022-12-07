package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreateMaxTest {

    private final CreateMax createMax = new CreateMax();

    /**
     * <table>
     *     <tr>
     *         <td>numbers</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, -3, 4, -5]</td>
     *         <td>15</td>
     *     </tr>
     *     <tr>
     *         <td>[0, -31, 24, 10, 1, 9]</td>
     *         <td>240</td>
     *     </tr>
     *     <tr>
     *         <td>[10, 20, 30, 5, 5, 20, 5]</td>
     *         <td>600</td>
     *     </tr>
     * </table>
     */
    @Test
    void createMaxTest() {
        assertThat(createMax.solution(new int[]{1, 2, -3, 4, -5})).isEqualTo(15);
        assertThat(createMax.solution(new int[]{0, -31, 24, 10, 1, 9})).isEqualTo(240);
        assertThat(createMax.solution(new int[]{10, 20, 30, 5, 5, 20, 5})).isEqualTo(600);
        assertThat(createMax.solution(new int[]{-500, 2})).isEqualTo(-1000);
        assertThat(createMax.solution(new int[]{-1, 1})).isEqualTo(-1);
    }

}