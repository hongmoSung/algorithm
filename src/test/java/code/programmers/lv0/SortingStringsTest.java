package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortingStringsTest {

    private final SortingStrings sortingStrings = new SortingStrings();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"hi12392"</td>
     *         <td>[1, 2, 2, 3, 9]</td>
     *     </tr>
     *     <tr>
     *         <td>"p2o4i8gj2"</td>
     *         <td>[2, 2, 4, 8]</td>
     *     </tr>
     *     <tr>
     *         <td>"abcde0"</td>
     *         <td>[0]</td>
     *     </tr>
     * </table>
     */
    @Test
    void sortingStringsTest() {
        assertThat(sortingStrings.solution("hi12392")).isEqualTo(new int[]{1, 2, 2, 3, 9});
        assertThat(sortingStrings.solution("p2o4i8gj2")).isEqualTo(new int[]{2, 2, 4, 8});
        assertThat(sortingStrings.solution("abcde0")).isEqualTo(new int[]{0});
    }

}