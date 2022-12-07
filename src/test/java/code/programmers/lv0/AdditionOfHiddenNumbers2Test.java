package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionOfHiddenNumbers2Test {

    private final AdditionOfHiddenNumbers2 additionOfHiddenNumbers2 = new AdditionOfHiddenNumbers2();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"aAb1B2cC34oOp"</td>
     *         <td>37</td>
     *     </tr>
     *     <tr>
     *         <td>"1a2b3c4d123Z"</td>
     *         <td>133</td>
     *     </tr>
     * </table>
     */
    @Test
    void additionOfHiddenNumbers2Test() {
        assertThat(additionOfHiddenNumbers2.solution("aAb1B2cC34oOp")).isEqualTo(37);
        assertThat(additionOfHiddenNumbers2.solution("1a2b3c4d123Z")).isEqualTo(133);
    }

}