package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 클래스 제목(작업목적)
 *
 * @author hm.sung
 * @since 2022/11/21
 */
class ArraySimilarityTest {

    private final ArraySimilarity arraySimilarity = new ArraySimilarity();

    /**
     * <table>
     *     <tr>
     *         <td>s1</td>
     *         <td>s2</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>["a", "b", "c"]</td>
     *         <td>["com", "b", "d", "p", "c"]</td>
     *         <td>2</td>
     *     </tr>
     *     <tr>
     *         <td>["n", "omg"]</td>
     *         <td>["m", "dot"]</td>
     *         <td>0</td>
     *     </tr>
     * </table>
     */
    @Test
    void arraySimilarityTest() {
        assertThat(arraySimilarity.solution(new String[]{"a", "b", "c"},
                new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);

        assertThat(arraySimilarity.solution(new String[]{"n", "omg"},
                new String[]{"m", "dot"})).isEqualTo(0);
    }

}