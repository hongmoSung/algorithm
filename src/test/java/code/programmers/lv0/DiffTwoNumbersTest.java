package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiffTwoNumbersTest {

    private final DiffTwoNumbers diffTwoNumbers = new DiffTwoNumbers();

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
     * <th>-1</th>
     * </tr>
     * <tr>
     * <th>100</th>
     * <th>2</th>
     * <th>98</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void diffTwoNumbersTest() {
        assertThat(diffTwoNumbers.solution(2, 3)).isEqualTo(-1);
        assertThat(diffTwoNumbers.solution(100, 2)).isEqualTo(98);
    }

}