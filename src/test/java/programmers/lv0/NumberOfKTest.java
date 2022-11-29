package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfKTest {

    private final NumberOfK numberOfK = new NumberOfK();

    /**
     * <table>
     *     <tr>
     *         <td>i</td>
     *         <td>j</td>
     *         <td>k</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>1</td>
     *         <td>13</td>
     *         <td>1</td>
     *         <td>6</td>
     *     </tr>
     *     <tr>
     *         <td>10</td>
     *         <td>50</td>
     *         <td>5</td>
     *         <td>5</td>
     *     </tr>
     *     <tr>
     *         <td>3</td>
     *         <td>10</td>
     *         <td>2</td>
     *         <td>0</td>
     *     </tr>
     * </table>
     */
    @Test
    void numberOfKTest() {
        assertThat(numberOfK.solution(1, 13, 1)).isEqualTo(6);
        assertThat(numberOfK.solution(10, 50, 5)).isEqualTo(5);
        assertThat(numberOfK.solution(3, 10, 2)).isEqualTo(0);
    }

}