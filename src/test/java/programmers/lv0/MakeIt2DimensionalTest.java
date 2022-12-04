package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MakeIt2DimensionalTest {

    private final MakeIt2Dimensional makeIt2Dimensional = new MakeIt2Dimensional();

    /**
     * <table>
     *     <tr>
     *         <td>num_list</td>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3, 4, 5, 6, 7, 8]</td>
     *         <td>2</td>
     *         <td>[[1, 2], [3, 4], [5, 6], [7, 8]]</td>
     *     </tr>
     *     <tr>
     *         <td>[100, 95, 2, 4, 5, 6, 18, 33, 948]</td>
     *         <td>3</td>
     *         <td>[[100, 95, 2], [4, 5, 6], [18, 33, 948]]</td>
     *     </tr>
     * </table>
     */
    @Test
    void makeIt2DimensionalTest() {
        assertThat(makeIt2Dimensional.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2))
                .isEqualTo(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
        assertThat(makeIt2Dimensional.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3))
                .isEqualTo(new int[][]{{100, 95, 2}, {4, 5, 6}, {18, 33, 948}});
    }

}