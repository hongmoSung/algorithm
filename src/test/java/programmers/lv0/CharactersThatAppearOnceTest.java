package programmers.lv0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class CharactersThatAppearOnceTest {

    private final CharactersThatAppearOnce charactersThatAppearOnce = new CharactersThatAppearOnce();

    /**
     * <table>
     *     <tr>
     *         <td>s</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"abcabcadc"</td>
     *         <td>"d"</td>
     *     </tr>
     *     <tr>
     *         <td>"abdc"</td>
     *         <td>"abcd"</td>
     *     </tr>
     *     <tr>
     *         <td>"hello"</td>
     *         <td>"eho"</td>
     *     </tr>
     * </table>
     */
    @Test
    void charactersThatAppearOnceTest() {
        Assertions.assertThat(charactersThatAppearOnce.solution("abcabcadc")).isEqualTo("d");
        Assertions.assertThat(charactersThatAppearOnce.solution("abdc")).isEqualTo("abcd");
        Assertions.assertThat(charactersThatAppearOnce.solution("hello")).isEqualTo("eho");
    }

}