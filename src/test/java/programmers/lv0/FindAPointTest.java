package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindAPointTest {

    private final FindAPoint findAPoint = new FindAPoint();

    /**
     * <table>
     *     <tr>
     *         <td>dot</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[2, 4]</td>
     *         <td>1</td>
     *     </tr>
     *     <tr>
     *         <td>[-7, 9]</td>
     *         <td>2</td>
     *     </tr>
     * </table>
     */
    @Test
    void findAPointTest() {
        assertThat(findAPoint.solution(new int[]{2, 4})).isEqualTo(1);
        assertThat(findAPoint.solution(new int[]{-7, 9})).isEqualTo(2);
    }

}