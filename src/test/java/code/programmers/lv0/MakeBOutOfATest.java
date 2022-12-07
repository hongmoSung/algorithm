package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MakeBOutOfATest {

    private final MakeBOutOfA makeBOutOfA = new MakeBOutOfA();

    /**
     * <table>
     *     <tr>
     *         <td>before</td>
     *         <td>after</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"olleh"</td>
     *         <td>"hello"</td>
     *         <td>1</td>
     *     </tr>
     *     <tr>
     *         <td>"allpe"</td>
     *         <td>"apple"</td>
     *         <td>0</td>
     *     </tr>
     * </table>
     */
    @Test
    void makeBOutOfATest() {
        assertThat(makeBOutOfA.solution("olleh", "hello")).isEqualTo(1);
        assertThat(makeBOutOfA.solution("allpe", "apple")).isEqualTo(0);
    }

}