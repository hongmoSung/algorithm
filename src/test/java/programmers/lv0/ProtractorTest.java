package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProtractorTest {

    private final Protractor protractor = new Protractor();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>angle</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>70</th>
     * <th>1</th>
     * </tr>
     * <tr>
     * <th>91</th>
     * <th>3</th>
     * </tr>
     * <tr>
     * <th>180</th>
     * <th>4</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void protractorTest() {
        assertThat(protractor.solution(70)).isEqualTo(1);
        assertThat(protractor.solution(91)).isEqualTo(3);
        assertThat(protractor.solution(180)).isEqualTo(4);
    }

}