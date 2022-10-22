package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindAShareTest {

    private final FindAShare findAShare = new FindAShare();

    /**
     * <Table>
     *     <Thead>
     *         <tr>
     *             <th>num1</th>
     *             <th>num2</th>
     *             <th>result</th>
     *         </tr>
     *     </Thead>
     *     <Tbody>
     *         <tr>
     *             <th>10</th>
     *             <th>5</th>
     *             <th>2</th>
     *         </tr>
     *         <tr>
     *             <th>7</th>
     *             <th>2</th>
     *             <th>3</th>
     *         </tr>
     *     </Tbody>
     * </Table>
     */
    @Test
    void findAShareTest() {
        assertThat(findAShare.solution(10, 5)).isEqualTo(2);
        assertThat(findAShare.solution(7,2)).isEqualTo(3);
    }

}