package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivisionOfTwoNumbersTest {

    private final DivisionOfTwoNumbers divisionOfTwoNumbers = new DivisionOfTwoNumbers();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>num1</th>
     * <th>num2</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>3</th>
     * <th>2</th>
     * <th>1500</th>
     * </tr>
     * <tr>
     * <th>7</th>
     * <th>3</th>
     * <th>2333</th>
     * </tr>
     * <tr>
     * <th>1</th>
     * <th>16</th>
     * <th>62</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void divisionOfTwoNumbersTest() {
        assertThat(divisionOfTwoNumbers.solution(3, 2)).isEqualTo(1500);
        assertThat(divisionOfTwoNumbers.solution(7, 3)).isEqualTo(2333);
        assertThat(divisionOfTwoNumbers.solution(1, 16)).isEqualTo(62);
    }

}