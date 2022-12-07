package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TallerPersonTest {

    private final TallerPerson tallerPerson = new TallerPerson();

    /**
     * <Table>
     * <Thead>
     * <tr>
     * <th>array</th>
     * <th>height</th>
     * <th>result</th>
     * </tr>
     * </Thead>
     * <Tbody>
     * <tr>
     * <th>[149, 180, 192, 170]	</th>
     * <th>167</th>
     * <th>3</th>
     * </tr>
     * <tr>
     * <th>[180, 120, 140]</th>
     * <th>190</th>
     * <th>0</th>
     * </tr>
     * </Tbody>
     * </Table>
     */
    @Test
    void tallerPersonTest() {
        assertThat(tallerPerson.solution(new int[]{149, 180, 192, 170}, 167)).isEqualTo(3);
        assertThat(tallerPerson.solution(new int[]{180, 120, 140}, 190)).isEqualTo(0);
    }

}