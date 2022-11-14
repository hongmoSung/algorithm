package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvenOddNumberTest {

    private final EvenOddNumber evenOddNumber = new EvenOddNumber();

    /**
     * <Table>
     *     <Thead>
     *         <tr>
     *             <th>num_list</th>
     *             <th>result</th>
     *         </tr>
     *     </Thead>
     *     <Tbody>
     *         <tr>
     *             <th>[1, 2, 3, 4, 5]</th>
     *             <th>[2, 3]</th>
     *         </tr>
     *         <tr>
     *             <th>[1, 3, 5, 7]</th>
     *             <th>[0, 4]</th>
     *         </tr>
     *     </Tbody>
     * </Table>
     */
    @Test
    void evenOddNumberTest() {
        assertThat(evenOddNumber.solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 3});
        assertThat(evenOddNumber.solution(new int[]{1, 3, 5, 7})).isEqualTo(new int[]{0, 4});
    }


}