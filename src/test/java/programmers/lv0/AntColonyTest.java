package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AntColonyTest {

    private final AntColony antColony = new AntColony();

    /**
     * <table>
     *     <tr>
     *         <td>hp</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>23</td>
     *         <td>5</td>
     *     </tr>
     *     <tr>
     *         <td>24</td>
     *         <td>6</td>
     *     </tr>
     *     <tr>
     *         <td>999</td>
     *         <td>201</td>
     *     </tr>
     * </table>
     */
    @Test
    void antColonyTest() {
        assertThat(antColony.solution(23)).isEqualTo(5);
        assertThat(antColony.solution(24)).isEqualTo(6);
        assertThat(antColony.solution(999)).isEqualTo(201);
    }

}