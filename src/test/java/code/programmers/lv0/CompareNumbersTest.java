package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompareNumbersTest {

    private final CompareNumbers compareNumbers = new CompareNumbers();

    /**
     * <Table>
     *     <Thead>
     *         <tr>
     *             <th>num1</th>
     *             <th>num2</th>
     *             <th>result</th>
     *         </tr>
     *     </Thead>
     *     <Tbody>
     *         <tr>
     *             <th>2</th>
     *             <th>3</th>
     *             <th>-1</th>
     *         </tr>
     *         <tr>
     *             <th>-11</th>
     *             <th>-11</th>
     *             <th>-1</th>
     *         </tr>
     *         <tr>
     *             <th>-7</th>
     *             <th>99</th>
     *             <th>-1</th>
     *         </tr>
     *     </Tbody>
     * </Table>
     */
    @Test
    void compareNumbersTest() {
        assertThat(compareNumbers.solution(2, 3)).isEqualTo(-1);
        assertThat(compareNumbers.solution(11, 11)).isEqualTo(1);
        assertThat(compareNumbers.solution(7, 9)).isEqualTo(-1);
    }

}