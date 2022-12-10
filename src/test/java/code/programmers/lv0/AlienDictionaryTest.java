package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlienDictionaryTest {

    private final AlienDictionary alienDictionary = new AlienDictionary();

    /**
     * <table>
     *     <tr>
     *         <td>spell</td>
     *         <td>dic</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>["p", "o", "s"]</td>
     *         <td>["sod", "eocd", "qixm", "adio", "soo"]</td>
     *         <td>2</td>
     *     </tr>
     *     <tr>
     *         <td>["z", "d", "x"]</td>
     *         <td>["def", "dww", "dzx", "loveaw"]</td>
     *         <td>1</td>
     *     </tr>
     *     <tr>
     *         <td>["s", "o", "m", "d"]</td>
     *         <td>["moos", "dzx", "smm", "sunmmo", "som"]</td>
     *         <td>2</td>
     *     </tr>
     * </table>
     */
    @Test
    void alienDictionaryTest() {
        assertThat(alienDictionary.solution(new String[]{"p", "o", "s"},
                new String[]{"sod", "eocd", "qixm", "adio", "soo"})).isEqualTo(2);
        assertThat(alienDictionary.solution(new String[]{"z", "d", "x"},
                new String[]{"def", "dww", "dzx", "loveaw"})).isEqualTo(1);
        assertThat(alienDictionary.solution(new String[]{"s", "o", "m", "d"},
                new String[]{"moos", "dzx", "smm", "sunmmo", "som"})).isEqualTo(2);
    }
}