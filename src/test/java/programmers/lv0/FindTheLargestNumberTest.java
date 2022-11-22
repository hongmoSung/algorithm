package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheLargestNumberTest {

    private final FindTheLargestNumber findTheLargestNumber = new FindTheLargestNumber();

    /**
     * <table>
     *     <tr>
     *         <td>array</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>[1, 8, 3]</td>
     *         <td>[8, 1]</td>
     *     </tr>
     *     <tr>
     *         <td>[9, 10, 11, 8]</td>
     *         <td>[11, 2]</td>
     *     </tr>
     * </table>
     */
    @Test
    void findTheLargestNumberTest() {
        assertThat(findTheLargestNumber.solution(new int[]{1, 8, 3})).isEqualTo(new int[]{8, 1});
        assertThat(findTheLargestNumber.solution(new int[]{9, 10, 11, 8})).isEqualTo(new int[]{11, 2});
    }

}