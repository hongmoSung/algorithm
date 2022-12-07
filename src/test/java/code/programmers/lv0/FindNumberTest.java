package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindNumberTest {

    private final FindNumber findNumber = new FindNumber();

    /**
     * <table>
     *     <tr>
     *         <td>num</td>
     *         <td>k</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>29183</td>
     *         <td>1</td>
     *         <td>3</td>
     *     </tr>
     *     <tr>
     *         <td>232443</td>
     *         <td>4</td>
     *         <td>4</td>
     *     </tr>
     *     <tr>
     *         <td>123456</td>
     *         <td>7</td>
     *         <td>-1</td>
     *     </tr>
     * </table>
     */
    @Test
    void findNumberTest() {
        assertThat(findNumber.solution(29183, 1)).isEqualTo(3);
        assertThat(findNumber.solution(232443, 4)).isEqualTo(4);
        assertThat(findNumber.solution(123456, 7)).isEqualTo(-1);
    }

}