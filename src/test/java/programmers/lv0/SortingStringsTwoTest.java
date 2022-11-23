package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortingStringsTwoTest {

    private final SortingStringsTwo sortingStringsTwo = new SortingStringsTwo();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"Bcad"</td>
     *         <td>"abcd"</td>
     *     </tr>
     *     <tr>
     *         <td>"heLLo"</td>
     *         <td>"ehllo"</td>
     *     </tr>
     *     <tr>
     *         <td>"Python"</td>
     *         <td>"hnopty"</td>
     *     </tr>
     * </table>
     */
    @Test
    void sortingStringsTwoTest() {
        assertThat(sortingStringsTwo.solution("Bcad")).isEqualTo("abcd");
        assertThat(sortingStringsTwo.solution("heLLo")).isEqualTo("ehllo");
        assertThat(sortingStringsTwo.solution("Python")).isEqualTo("hnopty");
    }

}