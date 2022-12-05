package programmers.lv0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SetTheOrderOfTreatmentTest {

    private final SetTheOrderOfTreatment setTheOrderOfTreatment = new SetTheOrderOfTreatment();

    /**
     * <table>
     *     <tr>
     *         <td>emergency</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[3, 76, 24]</td>
     *         <td>[3, 1, 2]</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3, 4, 5, 6, 7]</td>
     *         <td>[7, 6, 5, 4, 3, 2, 1]</td>
     *     </tr>
     *     <tr>
     *         <td>[30, 10, 23, 6, 100]</td>
     *         <td>[2, 4, 3, 5, 1]</td>
     *     </tr>
     * </table>
     */
    @Test
    void setTheOrderOfTreatmentTest() {
        Assertions.assertThat(setTheOrderOfTreatment.solution(new int[]{3, 76, 24}))
                .isEqualTo(new int[]{3, 1, 2});
        Assertions.assertThat(setTheOrderOfTreatment.solution(new int[]{1, 2, 3, 4, 5, 6, 7}))
                .isEqualTo(new int[]{7, 6, 5, 4, 3, 2, 1});
        Assertions.assertThat(setTheOrderOfTreatment.solution(new int[]{30, 10, 23, 6, 100}))
                .isEqualTo(new int[]{2, 4, 3, 5, 1});
    }

}