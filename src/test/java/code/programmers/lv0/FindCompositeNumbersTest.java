package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindCompositeNumbersTest {

    private final FindCompositeNumbers findCompositeNumbers = new FindCompositeNumbers();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>10</td>
     *         <td>5</td>
     *     </tr>
     *     <tr>
     *         <td>15</td>
     *         <td>8</td>
     *     </tr>
     * </table>
     */
    @Test
    void findCompositeNumbersTest() {
        assertThat(findCompositeNumbers.solution(10)).isEqualTo(5);
        assertThat(findCompositeNumbers.solution(15)).isEqualTo(8);
    }

}