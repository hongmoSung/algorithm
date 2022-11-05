package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionOfFractionsTest {

    private final AdditionOfFractions additionOfFractions = new AdditionOfFractions();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>denum1</th>
     * <th>num1</th>
     * <th>denum2</th>
     * <th>num2</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>1</th>
     * <th>2</th>
     * <th>3</th>
     * <th>4</th>
     * <th>[5, 4]</th>
     * </tr>
     * <tr>
     * <th>9</th>
     * <th>2</th>
     * <th>1</th>
     * <th>3</th>
     * <th>[29, 6]</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void additionOfFractionsTest() {
        assertThat(additionOfFractions.solution(1, 2, 3, 4)).isEqualTo(new int[]{5, 4});
        assertThat(additionOfFractions.solution(9, 2, 1, 3)).isEqualTo(new int[]{29, 6});
    }

}