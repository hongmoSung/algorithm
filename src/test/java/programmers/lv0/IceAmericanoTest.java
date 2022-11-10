package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IceAmericanoTest {

    private final IceAmericano iceAmericano = new IceAmericano();

    /**
     * <table>
     *     <tr>
     *         <td>money</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>5,500</td>
     *         <td>[1, 0]</td>
     *     </tr>
     *     <tr>
     *         <td>15,000</td>
     *         <td>[2, 4000]</td>
     *     </tr>
     * </table>
     */
    @Test
    void iceAmericanoTest() {
        assertThat(iceAmericano.solution(5500)).isEqualTo(new int[]{1, 0});
        assertThat(iceAmericano.solution(15000)).isEqualTo(new int[]{2, 4000});
    }

}