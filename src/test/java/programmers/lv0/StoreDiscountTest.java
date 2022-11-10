package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StoreDiscountTest {

    private final StoreDiscount storeDiscount = new StoreDiscount();

    /**
     * <table>
     *  <tr>
     *      <td>price</td>
     *      <td>result</td>
     *  </tr>
     *  <tr>
     *      <td>150,000</td>
     *      <td>142,500</td>
     *  </tr>
     *  <tr>
     *      <td>580,000</td>
     *      <td>464,000</td>
     *  </tr>
     * </table>
     */
    @Test
    void storeDiscountTest() {
        assertThat(storeDiscount.solution(150000)).isEqualTo(142500);
        assertThat(storeDiscount.solution(580000)).isEqualTo(464000);

    }

}