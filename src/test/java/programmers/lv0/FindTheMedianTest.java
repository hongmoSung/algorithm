package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheMedianTest {

    private final FindTheMedian findTheMedian = new FindTheMedian();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>array</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>[1, 2, 7, 10, 11]</th>
     * <th>7</th>
     * </tr>
     * <tr>
     * <th>[9, -1, 0]</th>
     * <th>0</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void findTheMedianTest() {
        assertThat(findTheMedian.solution(new int[]{1, 2, 7, 10, 11})).isEqualTo(7);
        assertThat(findTheMedian.solution(new int[]{9, -1, 0})).isEqualTo(0);
    }

}