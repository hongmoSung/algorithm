package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LetterTest {

    private final Letter letter = new Letter();

    /**
     * <table>
     *     <tr>
     *         <td>message</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"happy birthday!"</td>
     *         <td>30</td>
     *     </tr>
     *     <tr>
     *         <td>"I love you~"</td>
     *         <td>22</td>
     *     </tr>
     * </table>
     */
    @Test
    void letterTest() {
        assertThat(letter.solution("happy birthday!")).isEqualTo(30);
        assertThat(letter.solution("I love you~")).isEqualTo(22);
    }

}