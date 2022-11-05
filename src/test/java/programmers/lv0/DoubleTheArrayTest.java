package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleTheArrayTest {

    private final DoubleTheArray doubleTheArray = new DoubleTheArray();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>numbers</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>[1, 2, 3, 4, 5]</th>
     * <th>[2, 4, 6, 8, 10]</th>
     * </tr>
     * <tr>
     * <th>[1, 2, 100, -99, 1, 2, 3]</th>
     * <th>[2, 4, 200, -198, 2, 4, 6]</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void doubleTheArrayTest() {
        assertThat(doubleTheArray.solution(new int[]{1, 2, 3, 4, 5}))
                .isEqualTo(new int[]{2, 4, 6, 8, 10});

        assertThat(doubleTheArray.solution(new int[]{1, 2, 100, -99, 1, 2, 3}))
                .isEqualTo(new int[]{2, 4, 200, -198, 2, 4, 6});
    }

}