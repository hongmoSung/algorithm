package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 클래스 제목(작업목적)
 *
 * @author hm.sung
 * @since 2022/11/21
 */
class AddDigitsTest {

    private final AddDigits addDigits = new AddDigits();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>1234</td>
     *         <td>10</td>
     *     </tr>
     *     <tr>
     *         <td>930211</td>
     *         <td>16</td>
     *     </tr>
     * </table>
     */
    @Test
    void addDigitsTest() {
        assertThat(addDigits.solution(1234)).isEqualTo(10);
        assertThat(addDigits.solution(930211)).isEqualTo(16);
    }

}