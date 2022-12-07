package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HateEvenNumbersTest {

    private final HateEvenNumbers hateEvenNumbers = new HateEvenNumbers();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>n</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>10</th>
     * <th>[1, 3, 5, 7, 9]</th>
     * </tr>
     * <tr>
     * <th>15</th>
     * <th>[1, 3, 5, 7, 9, 11, 13, 15]</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void hateEvenNumbersTest() {
        assertThat(hateEvenNumbers.solution(10)).isEqualTo(new int[]{1, 3, 5, 7, 9});
        assertThat(hateEvenNumbers.solution(15)).isEqualTo(new int[]{1, 3, 5, 7, 9, 11, 13, 15});
    }

}