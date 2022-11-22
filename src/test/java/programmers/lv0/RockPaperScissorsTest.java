package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RockPaperScissorsTest {

    private final RockPaperScissors rockPaperScissors = new RockPaperScissors();

    /**
     * <table>
     *     <tr>
     *         <td>rsp</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"2"</td>
     *         <td>"0"</td>
     *     </tr>
     *     <tr>
     *         <td>"205"</td>
     *         <td>"052"</td>
     *     </tr>
     * </table>
     */
    @Test
    void rockPaperScissorsTest() {
        assertThat(rockPaperScissors.solution("2")).isEqualTo("0");
        assertThat(rockPaperScissors.solution("205")).isEqualTo("052");
    }

}