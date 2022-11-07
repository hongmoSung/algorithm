package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrequencyValueTest {

    private final FrequencyValue frequencyValue = new FrequencyValue();

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
     * <th>[1, 2, 3, 3, 3, 4]</th>
     * <th>3</th>
     * </tr>
     * <tr>
     * <th>[1, 1, 2, 2]	</th>
     * <th>-1</th>
     * </tr>
     * <tr>
     * <th>[1]</th>
     * <th>1</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void frequencyValueTest() {
        assertThat(frequencyValue.solution(new int[]{1, 2, 3, 3, 3, 4})).isEqualTo(3);
        assertThat(frequencyValue.solution(new int[]{1, 1, 2, 2})).isEqualTo(-1);
        assertThat(frequencyValue.solution(new int[]{1})).isEqualTo(1);
    }

}