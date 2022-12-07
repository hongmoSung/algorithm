package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SharePizza1Test {

    private final SharePizza1 sharePizza1 = new SharePizza1();

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
     * <th>7</th>
     * <th>1</th>
     * </tr>
     * <tr>
     * <th>1</th>
     * <th>1</th>
     * </tr>
     * <tr>
     * <th>15</th>
     * <th>3</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void sharePizza1Test() {
        assertThat(sharePizza1.solution(7)).isEqualTo(1);
        assertThat(sharePizza1.solution(1)).isEqualTo(1);
        assertThat(sharePizza1.solution(15)).isEqualTo(3);
    }

}