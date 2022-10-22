package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoNumbersTest {

    private final SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();

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
     * <th>2</th>
     * <th>3</th>
     * <th>5</th>
     * </tr>
     * <tr>
     * <th>100</th>
     * <th>2</th>
     * <th>102</th>
     * </tr>
     * </Tbody>
     * </Table>
     */

    @Test
    void sumOfTwoNumbersTest() {
        assertThat(sumOfTwoNumbers.solution(2, 3)).isEqualTo(5);
        assertThat(sumOfTwoNumbers.solution(100, 2)).isEqualTo(102);
    }

}