package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryAdditionTest {

    private final BinaryAddition binaryAddition = new BinaryAddition();

    /**
     * <table>
     *     <tr>
     *         <td>bin1</td>
     *         <td>bin2</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"10"</td>
     *         <td>"11"</td>
     *         <td>"101"</td>
     *     </tr>
     *     <tr>
     *         <td>"1001"</td>
     *         <td>"1111"</td>
     *         <td>"11000"</td>
     *     </tr>
     * </table>
     */
    @Test
    void binaryAdditionTest() {
        assertThat(binaryAddition.solution("10", "11")).isEqualTo("101");
        assertThat(binaryAddition.solution("1001", "1111")).isEqualTo("11000");
    }

}