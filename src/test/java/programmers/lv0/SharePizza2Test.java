package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SharePizza2Test {

    private final SharePizza2 sharePizza2 = new SharePizza2();

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
     * <th>6</th>
     * <th>1</th>
     * </tr>
     * <tr>
     * <th>10</th>
     * <th>5</th>
     * </tr>
     * <tr>
     * <th>4</th>
     * <th>2</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void sharePizza2Test() {
        assertThat(sharePizza2.solution(6)).isEqualTo(1);
        assertThat(sharePizza2.solution(10)).isEqualTo(5);
        assertThat(sharePizza2.solution(4)).isEqualTo(2);
    }

}