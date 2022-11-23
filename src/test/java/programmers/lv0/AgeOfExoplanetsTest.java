package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AgeOfExoplanetsTest {

    private final AgeOfExoplanets ageOfExoplanets = new AgeOfExoplanets();

    /**
     * <table>
     *     <tr>
     *         <td>age</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>23</td>
     *         <td>"cd"</td>
     *     </tr>
     *     <tr>
     *         <td>51</td>
     *         <td>"fb"</td>
     *     </tr>
     *     <tr>
     *         <td>100</td>
     *         <td>"baa"</td>
     *     </tr>
     * </table>
     */
    @Test
    void ageOfExoplanetsTest() {
        assertThat(ageOfExoplanets.solution(23)).isEqualTo("cd");
        assertThat(ageOfExoplanets.solution(51)).isEqualTo("fb");
        assertThat(ageOfExoplanets.solution(100)).isEqualTo("baa");
    }

}