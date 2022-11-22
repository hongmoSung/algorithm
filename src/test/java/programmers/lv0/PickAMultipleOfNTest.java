package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PickAMultipleOfNTest {

    private final PickAMultipleOfN pickAMultipleOfN = new PickAMultipleOfN();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>numlist</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>3</td>
     *         <td>[4, 5, 6, 7, 8, 9, 10, 11, 12]</td>
     *         <td>[6, 9, 12]</td>
     *     </tr>
     *     <tr>
     *         <td>5</td>
     *         <td>[1, 9, 3, 10, 13, 5]</td>
     *         <td>[10, 5]</td>
     *     </tr>
     *     <tr>
     *         <td>12</td>
     *         <td>[2, 100, 120, 600, 12, 12]</td>
     *         <td>[120, 600, 12, 12]</td>
     *     </tr>
     * </table>
     */
    @Test
    void pickAMultipleOfNTest() {
        assertThat(pickAMultipleOfN.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}))
                .isEqualTo(new int[]{6, 9, 12});
        assertThat(pickAMultipleOfN.solution(5, new int[]{1, 9, 3, 10, 13, 5}))
                .isEqualTo(new int[]{10, 5});
        assertThat(pickAMultipleOfN.solution(12, new int[]{2, 100, 120, 600, 12, 12}))
                .isEqualTo(new int[]{120, 600, 12, 12});
    }
}