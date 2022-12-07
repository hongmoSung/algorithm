package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveSpecificCharactersTest {

    private final RemoveSpecificCharacters removeSpecificCharacters = new RemoveSpecificCharacters();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>letter</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"abcdef"</td>
     *         <td>"f"</td>
     *         <td>"abcde"</td>
     *     </tr>
     *     <tr>
     *         <td>"BCBdbe"</td>
     *         <td>"B"</td>
     *         <td>"Cdbe"</td>
     *     </tr>
     * </table>
     */
    @Test
    void removeSpecificCharactersTest() {
        assertThat(removeSpecificCharacters.solution("abcdef", "f")).isEqualTo("abcde");
        assertThat(removeSpecificCharacters.solution("BCBdbe", "B")).isEqualTo("Cdbe");
    }

}