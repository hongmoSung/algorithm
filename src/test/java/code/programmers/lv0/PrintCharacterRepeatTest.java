package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrintCharacterRepeatTest {

    private final PrintCharacterRepeat printCharacterRepeat = new PrintCharacterRepeat();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"hello"</td>
     *         <td>3</td>
     *         <td>"hhheeellllllooo"</td>
     *     </tr>
     * </table>
     */
    @Test
    void printCharacterRepeatTest() {
        assertThat(printCharacterRepeat.solution("hello", 3)).isEqualTo("hhheeellllllooo");
    }

}