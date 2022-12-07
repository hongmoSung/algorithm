package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetTheRestTest {

    private final GetTheRest getTheRest = new GetTheRest();

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
     * <th>3</th>
     * <th>2</th>
     * <th>1</th>
     * </tr>
     * <tr>
     * <th>10</th>
     * <th>5</th>
     * <th>0</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void getTheRestTest() {
        assertThat(getTheRest.solution(3, 2)).isEqualTo(1);
        assertThat(getTheRest.solution(10, 5)).isEqualTo(0);
    }

}