package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SharePizza3Test {

    private final SharePizza3 sharePizza3 = new SharePizza3();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>slice</th>
     * <th>n</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>7</th>
     * <th>10</th>
     * <th>2</th>
     * </tr>
     * <tr>
     * <th>4</th>
     * <th>12</th>
     * <th>3</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void sharePizza3Test() {
        assertThat(sharePizza3.solution(7, 10)).isEqualTo(2);
        assertThat(sharePizza3.solution(4, 12)).isEqualTo(3);
    }

}