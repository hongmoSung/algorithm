package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CutArrayTest {

    private final CutArray cutArray = new CutArray();

    /**
     * <table>
     *     <tr>
     *         <td>numbers</td>
     *         <td>num1</td>
     *         <td>num2</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3, 4, 5]</td>
     *         <td>1</td>
     *         <td>3</td>
     *         <td>[2, 3, 4]</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 3, 5]</td>
     *         <td>1</td>
     *         <td>2</td>
     *         <td>[3, 5]</td>
     *     </tr>
     * </table>
     */
    @Test
    void cutArrayTest() {
        assertThat(cutArray.solution(new int[]{1, 2, 3, 4, 5}, 1, 3)).isEqualTo(new int[]{2, 3, 4});
        assertThat(cutArray.solution(new int[]{1, 3, 5}, 1, 2)).isEqualTo(new int[]{3, 5});
    }

}