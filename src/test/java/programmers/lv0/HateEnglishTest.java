package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HateEnglishTest {

    private final HateEnglish hateEnglish = new HateEnglish();

    /**
     * <table>
     *     <tr>
     *         <td>numbers</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"onetwothreefourfivesixseveneightnine"</td>
     *         <td>123456789</td>
     *     </tr>
     *     <tr>
     *         <td>"onefourzerosixseven"</td>
     *         <td>14067</td>
     *     </tr>
     * </table>
     */
    @Test
    void hateEnglishTest() {
        assertThat(hateEnglish.solution("onetwothreefourfivesixseveneightnine")).isEqualTo(123456789);
        assertThat(hateEnglish.solution("onefourzerosixseven")).isEqualTo(14067);
    }

}