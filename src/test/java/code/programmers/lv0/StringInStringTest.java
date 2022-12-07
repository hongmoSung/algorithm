package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringInStringTest {

    private final StringInString stringInString = new StringInString();

    /**
     * <table>
     *     <tr>
     *         <td>str1</td>
     *         <td>str2</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"ab6CDE443fgh22iJKlmn1o"</td>
     *         <td>"6CD"</td>
     *         <td>1</td>
     *     </tr>
     *     <tr>
     *         <td>"ppprrrogrammers"</td>
     *         <td>"pppp"</td>
     *         <td>2</td>
     *     </tr>
     * </table>
     */
    @Test
    void stringInStringTest() {
        assertThat(stringInString.solution("ab6CDE443fgh22iJKlmn1o", "6CD")).isEqualTo(1);
        assertThat(stringInString.solution("ppprrrogrammers", "pppp")).isEqualTo(2);
    }

}