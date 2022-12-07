package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BacterialGrowthTest {

    private final BacterialGrowth bacterialGrowth = new BacterialGrowth();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>t</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>2</td>
     *         <td>10</td>
     *         <td>2048</td>
     *     </tr>
     *     <tr>
     *         <td>7</td>
     *         <td>15</td>
     *         <td>229,376</td>
     *     </tr>
     * </table>
     */
    @Test
    void bacterialGrowthTest() {
        assertThat(bacterialGrowth.solution(2, 10)).isEqualTo(2048);
        assertThat(bacterialGrowth.solution(7, 15)).isEqualTo(229376);
    }

}