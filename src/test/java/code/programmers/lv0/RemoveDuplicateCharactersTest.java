package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicateCharactersTest {

    private final RemoveDuplicateCharacters removeDuplicateCharacters = new RemoveDuplicateCharacters();

    /**
     * <table>
     *     <tr>
     *         <td>my_string</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"people"</td>
     *         <td>"peol"</td>
     *     </tr>
     *     <tr>
     *         <td>"We are the world"</td>
     *         <td>"We arthwold"</td>
     *     </tr>
     * </table>
     */
    @Test
    void removeDuplicateCharactersTest() {
        assertThat(removeDuplicateCharacters.solution("people")).isEqualTo("peol");
        assertThat(removeDuplicateCharacters.solution("We are the world")).isEqualTo("We arthwold");
    }

}