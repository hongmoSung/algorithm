package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PaperCutTest {

    private final PaperCut paperCut = new PaperCut();

    /**
     * <table>
     *     <tr>
     *         <td>M</td>
     *         <td>N</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>2</td>
     *         <td>2</td>
     *         <td>3</td>
     *     </tr>
     *     <tr>
     *         <td>2</td>
     *         <td>5</td>
     *         <td>9</td>
     *     </tr>
     *     <tr>
     *         <td>1</td>
     *         <td>1</td>
     *         <td>0</td>
     *     </tr>
     * </table>
     */
    @Test
    void paperCutTest() {
        assertThat(paperCut.solution(2, 2)).isEqualTo(3);
        assertThat(paperCut.solution(2, 5)).isEqualTo(9);
        assertThat(paperCut.solution(1, 1)).isEqualTo(0);
    }


}