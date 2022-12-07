package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AgeOutputTest {

    private final AgeOutput ageOutput = new AgeOutput();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>age</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>40</th>
     * <th>1983</th>
     * </tr>
     * <tr>
     * <th>23</th>
     * <th>2000</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void ageTest() {
        assertThat(ageOutput.solution(40)).isEqualTo(1983);
        assertThat(ageOutput.solution(23)).isEqualTo(2000);
    }

}