package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    /**
     * <table>
     *     <tr>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>3628800</td>
     *         <td>10</td>
     *     </tr>
     *     <tr>
     *         <td>7</td>
     *         <td>3</td>
     *     </tr>
     * </table>
     */
    @Test
    void factorialTest() {
        assertThat(factorial.solution(3628800)).isEqualTo(10);
        assertThat(factorial.solution(7)).isEqualTo(3);
    }

}