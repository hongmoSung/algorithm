package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceIndexTest {

    private final ReplaceIndex replaceIndex = new ReplaceIndex();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>num1</td>
     *         <td>num2</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"hello"</td>
     *         <td>1</td>
     *         <td>2</td>
     *         <td>"hlelo"</td>
     *     </tr>
     *     <tr>
     *         <td>"I love you"</td>
     *         <td>3</td>
     *         <td>6</td>
     *         <td>"I l veoyou"</td>
     *     </tr>
     * </table>
     */
    @Test
    void replaceIndexTest() {
        assertThat(replaceIndex.solution("hello", 1, 2)).isEqualTo("hlelo");
        assertThat(replaceIndex.solution("I love you", 3, 6)).isEqualTo("I l veoyou");
    }

}