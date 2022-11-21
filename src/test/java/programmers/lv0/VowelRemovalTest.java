package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VowelRemovalTest {

    private final VowelRemoval vowelRemoval = new VowelRemoval();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"bus"</td>
     *         <td>"bs"</td>
     *     </tr>
     *     <tr>
     *         <td>"nice to meet you"</td>
     *         <td>"nc t mt y"</td>
     *     </tr>
     * </table>
     */
    @Test
    void vowelRemovalTest() {
        assertThat(vowelRemoval.solution("bus")).isEqualTo("bs");
        assertThat(vowelRemoval.solution("nice to meet you")).isEqualTo("nc t mt y");
    }
}