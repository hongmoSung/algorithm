package programmers.lv0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOf7Test {

    private final NumberOf7 numberOf7 = new NumberOf7();

    /**
     * <table>
     *     <tr>
     *         <td>array</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[7, 77, 17]</td>
     *         <td>4</td>
     *     </tr>
     *     <tr>
     *         <td>[10, 29]</td>
     *         <td>0</td>
     *     </tr>
     * </table>
     */
    @Test
    void numberOf7Test() {
        Assertions.assertThat(numberOf7.solution(new int[]{7, 77, 17})).isEqualTo(4);
        Assertions.assertThat(numberOf7.solution(new int[]{10, 29})).isEqualTo(0    );
    }

}