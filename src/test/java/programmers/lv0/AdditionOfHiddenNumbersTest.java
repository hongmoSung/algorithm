package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionOfHiddenNumbersTest {

    private final AdditionOfHiddenNumbers additionOfHiddenNumbers = new AdditionOfHiddenNumbers();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"aAb1B2cC34oOp"</td>
     *         <td>10</td>
     *     </tr>
     *     <tr>
     *         <td>"1a2b3c4d123"</td>
     *         <td>16</td>
     *     </tr>
     * </table>
     */
    @Test
    void additionOfHiddenNumbersTest() {
        assertThat(additionOfHiddenNumbers.solution("aAb1B2cC34oOp")).isEqualTo(10);
        assertThat(additionOfHiddenNumbers.solution("1a2b3c4d123")).isEqualTo(16);
    }

}