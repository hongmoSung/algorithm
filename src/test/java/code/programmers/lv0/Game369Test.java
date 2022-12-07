package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Game369Test {

    private final Game369 game369 = new Game369();

    /**
     * <table>
     *     <tr>
     *         <td>order</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>3</td>
     *         <td>1</td>
     *     </tr>
     *     <tr>
     *         <td>29423</td>
     *         <td>2</td>
     *     </tr>
     * </table>
     */
    @Test
    void game369Test() {
        assertThat(game369.solution(3)).isEqualTo(1);
        assertThat(game369.solution(29423)).isEqualTo(2);
    }

}