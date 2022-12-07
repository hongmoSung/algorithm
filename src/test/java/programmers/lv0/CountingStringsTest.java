package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountingStringsTest {

    private final CountingStrings countingStrings = new CountingStrings();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"3 + 4"</td>
     *         <td>7</td>
     *     </tr>
     * </table>
     */
    @Test
    void countingStringsTest() {
        assertThat(countingStrings.solution("3 + 4")).isEqualTo(7);
        assertThat(countingStrings.solution("13 - 44")).isEqualTo(-31);
    }

}