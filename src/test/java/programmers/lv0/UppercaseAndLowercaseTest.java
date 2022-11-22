package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UppercaseAndLowercaseTest {

    private final UppercaseAndLowercase uppercaseAndLowercase = new UppercaseAndLowercase();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"cccCCC"</td>
     *         <td>"CCCccc"</td>
     *     </tr>
     *     <tr>
     *         <td>"abCdEfghIJ"</td>
     *         <td>"ABcDeFGHij"</td>
     *     </tr>
     * </table>
     */
    @Test
    void uppercaseAndLowercaseTest() {
        assertThat(uppercaseAndLowercase.solution("cccCCC")).isEqualTo("CCCccc");
        assertThat(uppercaseAndLowercase.solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
    }

}