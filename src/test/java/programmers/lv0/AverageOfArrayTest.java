package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AverageOfArrayTest {

    private final AverageOfArray averageOfArray = new AverageOfArray();

    /**
     * <Table>
     *     <Thead>
     *         <tr>
     *             <th>numbers</th>
     *             <th>result</th>
     *         </tr>
     *     </Thead>
     *     <Tbody>
     *         <tr>
     *             <th>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</th>
     *             <th>5.5</th>
     *         </tr>
     *         <tr>
     *             <th>[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	</th>
     *             <th>94.0</th>
     *         </tr>
     *     </Tbody>
     * </Table>
     */
    @Test
    void averageOfArrayTest() {
        assertThat(averageOfArray.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(5.5);
        assertThat(averageOfArray.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})).isEqualTo(94.0);
    }

}