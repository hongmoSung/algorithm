package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateTheArrayTest {

    private final RotateTheArray rotateTheArray = new RotateTheArray();

    /**
     * <table>
     *     <tr>
     *         <td>numbers</td>
     *         <td>direction</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 2, 3]</td>
     *         <td>"right"</td>
     *         <td>[3, 1, 2]</td>
     *     </tr>
     *     <tr>
     *         <td>[4, 455, 6, 4, -1, 45, 6]</td>
     *         <td>"left"</td>
     *         <td>[455, 6, 4, -1, 45, 6, 4]</td>
     *     </tr>
     * </table>
     */
    @Test
    void rotateTheArrayTest() {
        assertThat(rotateTheArray.solution(new int[]{1, 2, 3}, "right")).isEqualTo(new int[]{3, 1, 2});
        assertThat(rotateTheArray.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"))
                .isEqualTo(new int[]{455, 6, 4, -1, 45, 6, 4});

    }

}