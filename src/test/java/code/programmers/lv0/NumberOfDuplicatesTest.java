package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 클래스 제목(작업목적)
 *
 * @author hm.sung
 * @since 2022/11/03
 */
class NumberOfDuplicatesTest {

    private final NumberOfDuplicates numberOfDuplicates = new NumberOfDuplicates();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>array</th>
     * <th>n</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>[1, 1, 2, 3, 4, 5]	</th>
     * <th>1</th>
     * <th>2</th>
     * </tr>
     * <tr>
     * <th>[0, 2, 3, 4]	</th>
     * <th>1</th>
     * <th>0</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void numberOfDuplicatesTest() {
        assertThat(numberOfDuplicates.solution(new int[]{1, 1, 2, 3, 4, 5}, 1)).isEqualTo(2);
        assertThat(numberOfDuplicates.solution(new int[]{0, 2, 3, 4}, 1)).isEqualTo(0);
    }

}