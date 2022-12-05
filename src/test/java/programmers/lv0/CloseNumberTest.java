package programmers.lv0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CloseNumberTest {

    private final CloseNumber closeNumber = new CloseNumber();

    /**
     * <table>
     *     <tr>
     *         <td>array</td>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[3, 10, 28]</td>
     *         <td>20</td>
     *         <td>28</td>
     *     </tr>
     *     <tr>
     *         <td>[10, 11, 12]</td>
     *         <td>13</td>
     *         <td>12</td>
     *     </tr>
     * </table>
     */
    @Test
    void closeNumberTest() {
        Assertions.assertThat(closeNumber.solution(new int[]{3, 10, 28}, 20)).isEqualTo(28);
        Assertions.assertThat(closeNumber.solution(new int[]{10, 12, 10}, 11)).isEqualTo(10);
    }
}