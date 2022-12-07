package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlipStringTest {

    private final FlipString flipString = new FlipString();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>return</td>
     *     </tr>
     *     <tr>
     *         <td>"jaron"</td>
     *         <td>"noraj"</td>
     *     </tr>
     *     <tr>
     *         <td>"bread"</td>
     *         <td>"daerb"</td>
     *     </tr>
     * </table>
     */
    @Test
    void flipString() {
        assertThat(flipString.solution("jaron")).isEqualTo("noraj");
        assertThat(flipString.solution("bread")).isEqualTo("daerb");
    }

}