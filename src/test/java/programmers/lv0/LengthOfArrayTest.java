package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthOfArrayTest {

    private final LengthOfArray lengthOfArray = new LengthOfArray();

    /**
     * <table>
     *     <tr>
     *         <td>strlist</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>["We", "are", "the", "world!"]</td>
     *         <td>[2, 3, 3, 6]</td>
     *     </tr>
     *     <tr>
     *         <td>["I", "Love", "Programmers."]</td>
     *         <td>[1, 4, 12]</td>
     *     </tr>
     * </table>
     */
    @Test
    void lengthOfArrayTest() {
        assertThat(lengthOfArray.solution(new String[]{"We", "are", "the", "world!"})).isEqualTo(new int[]{2, 3, 3, 6});
        assertThat(lengthOfArray.solution(new String[]{"I", "Love", "Programmers."})).isEqualTo(new int[]{1, 4, 12});
    }

}